package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.entities.UserLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.consumer.repository.BookRepository;
import com.liborrow.webservice.consumer.repository.BorrowRepository;
import com.liborrow.webservice.consumer.repository.MagazineRepository;
import com.liborrow.webservice.consumer.repository.UserAccountRepository;

@Transactional
public class BorrowManagerImpl extends AbstractManagerImpl implements BorrowManager {
	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
	UserAccountRepository userRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	MagazineRepository magazineRepository;
	
	@Override
	public BorrowDTO findBorrowById(long id)
	{
		Borrow borrow = borrowRepository.findOne(id);
		borrowEntityHibernateInitialization(borrow);
		BorrowDTO borrowDTO = getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, "org.liborrow.webservice.model.dto.BorrowDTO");
		return borrowDTO;
	}
	
	@Override
	public List<BorrowDTO> findOnGoingBorrowsByUser(UserLightDTO user)
	{
		if(user != null && user.getId()!=0)
		{
			
			//userEntityHibernateInitialization(user);
			if(user != null)
			{
				UserLight userEntity = getTransformerFactory().getUserLightTransformer().toUserLightEntity(user, true, UserLight.class.getSimpleName());
				List<Borrow> borrows = borrowRepository.searchOnGoingBorrowByUserAccount(userEntity);
				List<BorrowDTO> borrowsDTO = new ArrayList<>();
				for(Borrow borrow : borrows)
				{
					borrowEntityHibernateInitialization(borrow);
					borrowsDTO.add(getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, "org.liborrow.webservice.model.dto.BorrowDTO"));
				}
				getItemOfBorrow(borrowsDTO);
				return borrowsDTO;
			}else
			{
				return null;
			}
		}else {
			return null;
		}
	}
	
	@Override
	public List<BorrowDTO> findAllBorrows()
	{
		List<Borrow> borrows = borrowRepository.findAll();
		List<BorrowDTO> borrowsDTO = new ArrayList<>();
		for(Borrow borrow : borrows)
		{
			borrowEntityHibernateInitialization(borrow);
			borrowsDTO.add(getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, "org.liborrow.webservice.model.dto.BorrowDTO"));
		}
		return borrowsDTO;
	}
	
	public void borrowEntityHibernateInitialization(Borrow borrow)
	{
		Hibernate.initialize(borrow.getBorrower());
		Hibernate.initialize(borrow.getItem());
		Hibernate.initialize(borrow.getBorrower().getCitizenship());
	}
	
	public void userEntityHibernateInitialization(UserAccount user)
	{
		Hibernate.initialize(user.getCitizenship());
	}
	
	private void getItemOfBorrow(List<BorrowDTO> borrows)
	{
		for(BorrowDTO borrow : borrows)
		{
			if(borrow.getItemDTO().getItemType().equals("book"))
			{
				Book book = bookRepository.findOne(borrow.getItemDTO().getId());
				borrow.setBookDTO(getTransformerFactory().getBookTransformer().toBookDTO(book, true, BookDTO.class.getSimpleName()));
			}
			if(borrow.getItemDTO().getItemType().equals("magazine"))
			{
				Magazine magazine = magazineRepository.findOne(borrow.getItemDTO().getId());
				borrow.setMagazineDTO(getTransformerFactory().getMagazineTransformer().toMagazineDTO(magazine, true, MagazineDTO.class.getSimpleName()));
			}
		}
	}
}
