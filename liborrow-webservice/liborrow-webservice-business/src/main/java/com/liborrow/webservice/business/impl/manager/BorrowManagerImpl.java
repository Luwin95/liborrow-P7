package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.dto.WaitingListDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.entities.WaitingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.consumer.repository.BookRepository;
import com.liborrow.webservice.consumer.repository.BorrowRepository;
import com.liborrow.webservice.consumer.repository.MagazineRepository;
import com.liborrow.webservice.consumer.repository.UserAccountRepository;
import com.liborrow.webservice.consumer.repository.WaitingListRepository;

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
	
	@Autowired
	WaitingListRepository waitingListRepository;
	
	@Override
	public BorrowDTO findBorrowById(long id)
	{
		Borrow borrow = borrowRepository.getBorrowById(id);
		borrowEntityHibernateInitialization(borrow);
		BorrowDTO borrowDTO = getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, Borrow.class.getSimpleName());
		return borrowDTO;
	}
	
	@Override
	public List<BorrowDTO> findOnGoingBorrowsByUser(UserLightDTO user)
	{
		if(user != null && user.getId()!=0)
		{
			
			if(user != null)
			{
				UserLight userEntity = getTransformerFactory().getUserLightTransformer().toUserLightEntity(user, true, UserLight.class.getSimpleName());
				List<Borrow> borrows = borrowRepository.searchOnGoingBorrowByUserAccount(userEntity);
				List<BorrowDTO> borrowsDTO = new ArrayList<>();
				for(Borrow borrow : borrows)
				{
					borrowEntityHibernateInitialization(borrow);
					borrowsDTO.add(getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, Borrow.class.getSimpleName()));
				}
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
			borrowsDTO.add(getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, Borrow.class.getSimpleName()));
		}
		return borrowsDTO;
	}
	
	@Override
	public List<WaitingListDTO> findUserWaitingList(UserLightDTO user) {
		List<WaitingList> waitingLists = getDaoFactory().getWaitingListDao().getWaitingListByBorrower(user.getId());
		List<WaitingListDTO> waitingListsDTO = getTransformerFactory().getWaitingListTransformer().toWaitingListsDTO(waitingLists, true, WaitingList.class.getSimpleName() );
		return waitingListsDTO;
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
	
	public void userLightEntityHibernateInitialization(UserLight user)
	{
		Hibernate.initialize(user.getCitizenship());
	}
	
	@Override
	public boolean markAsExtended(BorrowDTO borrow) {
		if(borrow.getExtended())
		{
			return false;
		}else {
			Borrow borrowEntity = getTransformerFactory().getBorrowTransformer().toBorrowEntity(borrow, true, Borrow.class.getSimpleName());
			getDaoFactory().getBorrowDao().markAsExtended(borrowEntity);
			return true;
		}
		
	}
	
	@Override
	@Transactional
	public void newBorrow(BorrowDTO borrow) {
		Borrow borrowToSave = getTransformerFactory().getBorrowTransformer().toBorrowEntity(borrow, true, BorrowDTO.class.getSimpleName());
		borrowRepository.save(borrowToSave);
	}
	
	@Override
	@Transactional
	public void updateBorrow(BorrowDTO borrow) {
		Borrow borrowToSave = getTransformerFactory().getBorrowTransformer().toBorrowEntity(borrow, true, BorrowDTO.class.getSimpleName());
		borrowRepository.save(borrowToSave);
	}
	
	@Override
	@Transactional
	public void deleteBorrow(BorrowDTO borrow) {
		Borrow borrowToSave = getTransformerFactory().getBorrowTransformer().toBorrowEntity(borrow, true, BorrowDTO.class.getSimpleName());
		borrowRepository.delete(borrowToSave);
	}
	
	@Override
	public List<BorrowDTO> findLateBorrows() {
		List<Borrow> borrowsEntities = getDaoFactory().getBorrowDao().findLateGetBackBorrows();
		Set<Borrow> borrowsEntitiesSet = new HashSet<Borrow>();
		borrowsEntitiesSet.addAll(borrowsEntities);
		Set<BorrowDTO> borrows = getTransformerFactory().getBorrowTransformer().toBorrowsDTO(borrowsEntitiesSet, true, Borrow.class.getSimpleName());
		List<BorrowDTO> returnList = new ArrayList<>();
		returnList.addAll(borrows);
		return returnList;
	}
	
	@Override
	public List<BorrowDTO> remindBorrows() {
		List<Borrow> borrowsEntities = getDaoFactory().getBorrowDao().remindBorrows();
		Set<Borrow> borrowsEntitiesSet = new HashSet<Borrow>();
		borrowsEntitiesSet.addAll(borrowsEntities);
		Set<BorrowDTO> borrows = getTransformerFactory().getBorrowTransformer().toBorrowsDTO(borrowsEntitiesSet, true, Borrow.class.getSimpleName());
		List<BorrowDTO> returnList = new ArrayList<>();
		returnList.addAll(borrows);
		return returnList;
	}
	
	
	@Override
	public List<WaitingListDTO> getWaitingListAvailable() {
		List<WaitingList> reservations = getDaoFactory().getWaitingListDao().getWaitingListAvailable();
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		for(WaitingList reservation : reservations ) {
			reservation.setNotificationDate(now);
		}
		List <WaitingListDTO> reservationsDTO = getTransformerFactory().getWaitingListTransformer().toWaitingListsDTO(reservations, true, WaitingList.class.getSimpleName());
		saveReservations(reservationsDTO);
		return reservationsDTO;
	}
	
	@Override
	public List<WaitingListDTO> getWaitingListByItem(Long itemId) {
		return getTransformerFactory().getWaitingListTransformer().toWaitingListsDTO(getDaoFactory().getWaitingListDao().getWaitingListByItem(itemId), true, WaitingList.class.getSimpleName());
	}
	
	@Override
	public List<WaitingListDTO> getWaitingListByNotificationDateObsolete() {
		return getTransformerFactory().getWaitingListTransformer().toWaitingListsDTO(getDaoFactory().getWaitingListDao().getWaitingListByNotificationDateObsolete(), true, WaitingList.class.getSimpleName());
	}
	
	@Override
	public void removeReservations(List<Long> reservations) {
		for(Long reservation : reservations) {
			waitingListRepository.delete(reservation);
		}
	}
	
	@Override
	public void saveReservations(List<WaitingListDTO> reservations) {
		List<WaitingList> reservationsEntities = getTransformerFactory().getWaitingListTransformer().toWaitingListEntities(reservations, true, WaitingListDTO.class.getSimpleName());
		for(WaitingList reservation : reservationsEntities) {
			waitingListRepository.save(reservation);
		}
	}
	
	@Override
	public Calendar getNextGetBackDate(Long itemId) {
		Calendar returnDate =null;
		Calendar minExtendedDate = getDaoFactory().getBorrowDao().getNextGetBackDateExtended(itemId);
		Calendar minNotExtendedDate = getDaoFactory().getBorrowDao().getNextGetBackDateNotExtended(itemId);
		
		if(null == minExtendedDate && null != minNotExtendedDate) {
			minNotExtendedDate.add(Calendar.MONTH, 1);
			returnDate = minNotExtendedDate;
		}
		if(null == minNotExtendedDate && null != minExtendedDate) {
			minExtendedDate.add(Calendar.MONTH, 2);
			returnDate = minExtendedDate;
		}
		if(null != minNotExtendedDate && null != minExtendedDate) {
			minNotExtendedDate.add(Calendar.MONTH, 1);
			minExtendedDate.add(Calendar.MONTH, 2);
			returnDate = minExtendedDate.compareTo(minNotExtendedDate) > 0 ? minNotExtendedDate : minExtendedDate;
		}
		return returnDate;
	}
}
