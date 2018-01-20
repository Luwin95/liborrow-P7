package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.consumer.repository.BorrowRepository;
import com.liborrow.webservice.consumer.repository.UserAccountRepository;

@Transactional
public class BorrowManagerImpl extends AbstractManagerImpl implements BorrowManager {
	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
	UserAccountRepository userRepository;
	
	@Override
	public BorrowDTO findBorrowById(long id)
	{
		Borrow borrow = borrowRepository.findOne(id);
		borrowEntityHibernateInitialization(borrow);
		BorrowDTO borrowDTO = getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, "org.liborrow.webservice.model.dto.BorrowDTO");
		return borrowDTO;
	}
	
	@Override
	public List<BorrowDTO> findBorrowByUser(long userId)
	{
		if(userId != 0)
		{
			UserAccount user = userRepository.findOne(userId);
			userEntityHibernateInitialization(user);
			if(user != null)
			{
				List<Borrow> borrows = borrowRepository.findByBorrower(user);
				List<BorrowDTO> borrowsDTO = new ArrayList<>();
				for(Borrow borrow : borrows)
				{
					borrowEntityHibernateInitialization(borrow);
					borrowsDTO.add(getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, "org.liborrow.webservice.model.dto.BorrowDTO"));
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
			borrowsDTO.add(getTransformerFactory().getBorrowTransformer().toBorrowDTO(borrow, true, "org.liborrow.webservice.model.dto.BorrowDTO"));
		}
		return borrowsDTO;
	}
	
	public void borrowEntityHibernateInitialization(Borrow borrow)
	{
		Hibernate.initialize(borrow.getBorrower());
		Hibernate.initialize(borrow.getBorrower().getCitizenship());
		Hibernate.initialize(borrow.getBooks());
		Hibernate.initialize(borrow.getMagazines());
	}
	
	public void userEntityHibernateInitialization(UserAccount user)
	{
		Hibernate.initialize(user.getCitizenship());
	}
}
