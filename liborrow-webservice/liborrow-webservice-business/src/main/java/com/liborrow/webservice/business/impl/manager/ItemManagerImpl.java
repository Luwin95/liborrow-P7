package com.liborrow.webservice.business.impl.manager;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.ItemDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.entities.WaitingList;
import org.liborrow.webservice.model.utilsobject.AuthorDependenciesEnum;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.ReservationResponse;
import org.liborrow.webservice.model.utilsobject.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.consumer.repository.AuthorRepository;
import com.liborrow.webservice.consumer.repository.BookRepository;
import com.liborrow.webservice.consumer.repository.ItemRepository;
import com.liborrow.webservice.consumer.repository.MagazineRepository;
import com.liborrow.webservice.consumer.repository.WaitingListRepository;


@Service
public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	@Autowired
	@Resource
	ItemRepository itemRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	MagazineRepository magazineRepository;
	
	@Autowired
	WaitingListRepository waitingListRepository;
	
	private ReservationResponse reservationResponse = new ReservationResponse();
	
	@Override
	@Transactional(readOnly = true)
	public Item findItemById(long id)
	{
		return itemRepository.findOne(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public SearchResponse searchWithSimpleString(ItemCriterias itemCriterias, String[] simpleStringSplited) {
		SearchResponse searchResponse = new SearchResponse();
		searchResponse.getAuthors().addAll(
				getTransformerFactory().getAuthorTransformer().toAuthorsDTO(
						getDaoFactory().getAuthorDao().searchWithSimpleStringAuthor(itemCriterias, simpleStringSplited),AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS)
				);
		searchResponse.getBooks().addAll(
				getTransformerFactory().getBookTransformer().toBooksDTO(
						getDaoFactory().getBookDao().searchWithSimpleStringBook(itemCriterias, simpleStringSplited), true, "org.liborrow.webservice.model.dto.BookDTO")
				);
		searchResponse.getMagazines().addAll(
				getTransformerFactory().getMagazineTransformer().toMagazinesDTO(
						getDaoFactory().getMagazineDao().searchWithSimpleStringMagazine(itemCriterias, simpleStringSplited), true, "org.liborrow.webservice.model.dto.MagazineDTO")
				);
		return searchResponse;
	}
	
	@Override
	@Transactional(readOnly = true)
	public SearchResponse getLastFiveItems() {
		SearchResponse searchResponse = new SearchResponse();
		Set<Book> books = bookRepository.findTop5ByOrderByIdDesc();
		Set<Author> authors = authorRepository.findTop5ByOrderByIdDesc();
		Set<Magazine> magazines = magazineRepository.findTop5ByOrderByIdDesc();
		bookListEntityHibernateInitialization(books);
		authorListEntityHibernateLazyInitialization(authors);
		magazinesEntityHibernateInitialization(magazines);
		searchResponse.getBooks().addAll(
				getTransformerFactory().getBookTransformer().toBooksDTO(books, true, BookDTO.class.getSimpleName()));
		searchResponse.getAuthors().addAll(
				getTransformerFactory().getAuthorTransformer().toAuthorsDTO(authors,AuthorDependenciesEnum.AUTHOR_BOOKS, AuthorDependenciesEnum.AUTHOR_CITIZENSHIPS));
		searchResponse.getMagazines().addAll(
				getTransformerFactory().getMagazineTransformer().toMagazinesDTO(magazines, true, MagazineDTO.class.getSimpleName()));
		return searchResponse;
	}
	
	@Override
	public ReservationResponse reserveItem(ItemDTO item, UserLightDTO user) {
		//TODO VERIFIER QUE LA DEMANDE EST VALABLE
		if(checkReservationDemand(item, user)) {
			//TODO SI LA DEMANDE EST VALABLE RECUPERER LA DERNIERE VALEUR DE POSITION DANS LA LISTE
			Integer position = getDaoFactory().getWaitingListDao().getLastPosition(item.getId());
			//TODO SI AUCUNE LISTE N'EXISTE POUR CE LIVRE LA POSITION EST 1		
			//TODO SINON LA POSITION EST LA POSITION MAX + 1
			WaitingList waitingList = new WaitingList();
			waitingList.setPosition(position+1);
			waitingList.setItem(convertItemDTO(item));
			waitingList.setBorrower(getTransformerFactory().getUserLightTransformer().toUserLightEntity(user, true, UserLightDTO.class.getSimpleName()));
			waitingListRepository.save(waitingList);
			reservationResponse.setMessage("Vous avez bien été ajouté dans la liste d'attent des réservations de cet item. Votre position est : "+(position+1));
			reservationResponse.setResponseType("success");
		}
		return reservationResponse;
	}
	
	@Override
	public ReservationResponse cancelItemReservation(Integer itemId, UserLightDTO user) {
		// TODO VERIFIER LA PRESENCE DE L'ITEM DANS LA LISTE DE RESERVATION DE L'UTILISATEUR
		
		//TODO SUPPRIMER DE LA LISTE L'ITEM SELECTIONNE 
		return null;
	}
	
	private void bookEntityHibernateInitialization(Book book)
	{
		Hibernate.initialize(book.getImage());
		Hibernate.initialize(book.getAuthors());
		for(Author author : book.getAuthors())
		{
			Hibernate.initialize(author.getBooks());
			Hibernate.initialize(author.getCitizenships());
			for(Citizenship citizenship : author.getCitizenships())
			{
				Hibernate.initialize(citizenship.getAuthors());
			}
		}
		Hibernate.initialize(book.getBorrows());
		for(Borrow borrow : book.getBorrows())
		{
			Hibernate.initialize(borrow.getBorrower());
//			Hibernate.initialize(borrow.getBook());
//			Hibernate.initialize(borrow.getMagazine());
			Hibernate.initialize(borrow.getItem());
		}
	}
	
	private void bookListEntityHibernateInitialization(Collection<Book> books) {
		for(Book book : books)
		{
			bookEntityHibernateInitialization(book);
		}
	}
	
	private void authorEntityHibernateLazyInitialization(Author author) {
		Hibernate.initialize(author.getBooks());
		for(Book book : author.getBooks()){
			Hibernate.initialize(book.getAuthors());
			Hibernate.initialize(book.getImage());
			Hibernate.initialize(book.getBorrows());
			for(Borrow borrow : book.getBorrows())
			{
				Hibernate.initialize(borrow.getBorrower());
//				Hibernate.initialize(borrow.getBook());
//				Hibernate.initialize(borrow.getMagazine());
				Hibernate.initialize(borrow.getItem());
			}
		}
		Hibernate.initialize(author.getCitizenships());
		for(Citizenship citizenship : author.getCitizenships())
		{
			Hibernate.initialize(citizenship.getAuthors());
		}
	}
	
	private void authorListEntityHibernateLazyInitialization(Collection<Author> authors) {
		for(Author author : authors)
		{
			authorEntityHibernateLazyInitialization(author);
		}
	}
	
	private void magazineEntityHibernateInitialization(Magazine magazine)
	{
		Hibernate.initialize(magazine.getBorrows());
		Hibernate.initialize(magazine.getImage());
		for(Borrow borrow : magazine.getBorrows())
		{
			Hibernate.initialize(borrow.getBorrower());
			Hibernate.initialize(borrow.getBorrower().getCitizenship());
		}
	}
	
	private void magazinesEntityHibernateInitialization(Collection<Magazine> magazines)
	{
		for(Magazine magazine : magazines)
		{
			magazineEntityHibernateInitialization(magazine);
		}
	}
	
	private boolean checkReservationDemand(ItemDTO item, UserLightDTO user) {
		if(checkUserBorrowList(item, user) && checkWaitingListSize(item)) {
			return true;
		}else {
			return false;
		}
		//TODO VERIFIER QUE L'USAGER N'A PAS DEJA RESERVER CE LIVRE
	}
	
	private boolean checkUserBorrowList(ItemDTO item, UserLightDTO user) {
		//TODO VERIFIER QUE L'USAGER N'A PAS CET ITEM DANS SES PRÊTS EN COURS
		if(!getDaoFactory().getBorrowDao().checkItemForUser(item.getId(), user.getId())) {
			return true;
		}else {
			reservationResponse.setMessage("Votre demande n'a pu aboutir : la liste d'attente pour ce livre est complète, veuillez réessayer plus tard.");
			return false;
		}
	}
	
	private boolean checkWaitingListSize(ItemDTO item) {
		//TODO VERIFIER QUE LA LISTE D'ATTENTE NE DEPASSE PAS LE DOUBLE DU NOMBRE D'OUVRAGE EXISTANT
		if(getDaoFactory().getWaitingListDao().getWaitingListSize(item.getId())>=(2*item.getTotalCount())) {
			reservationResponse.setMessage("Votre demande n'a pu aboutir : vous avez déjà un prêt en cours pour ce livre.");
			return false;
		}else {
			return true;
		}
	}
	
	private Item convertItemDTO(ItemDTO item) {
		if(item.getItemType().equals("B")) {
			return getTransformerFactory().getBookTransformer().toBookEntity((BookDTO) item, true, BookDTO.class.getSimpleName());
		}else {
			return getTransformerFactory().getMagazineTransformer().toMagazineEntity((MagazineDTO) item, true, MagazineDTO.class.getSimpleName());
		}
	}
	
}
