package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.consumer.repository.BorrowRepository;
import com.liborrow.webservice.consumer.repository.UserAccountRepository;

@Transactional
public class BorrowManagerImpl implements BorrowManager {
	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
	UserAccountRepository userRepository;
	
	@Override
	public Borrow findBorrowById(long id)
	{
		Borrow borrow = borrowRepository.findOne(id);
		borrowEntityHibernateInitialization(borrow);
		return borrow;
	}
	
	@Override
	public List<Borrow> findBorrowByUser(long userId)
	{
		if(userId != 0)
		{
			UserAccount user = userRepository.findOne(userId);
			userEntityHibernateInitialization(user);
			if(user != null)
			{
				List<Borrow> borrows = borrowRepository.findByBorrower(user);
				for(Borrow borrow : borrows)
				{
					borrowEntityHibernateInitialization(borrow);
				}
				return borrows;
			}else
			{
				return null;
			}
		}else {
			return null;
		}
	}
	
	@Override
	public List<Borrow> findAllBorrows()
	{
		List<Borrow> borrows = borrowRepository.findAll();
		for(Borrow borrow : borrows)
		{
			borrowEntityHibernateInitialization(borrow);
		}
		return borrows;
	}
	
	public void borrowEntityHibernateInitialization(Borrow borrow)
	{
		Hibernate.initialize(borrow.getBorrower());
		Hibernate.initialize(borrow.getBorrower().getCitizenship());
		Hibernate.initialize(borrow.getItems());
	}
	
	public void userEntityHibernateInitialization(UserAccount user)
	{
		Hibernate.initialize(user.getCitizenship());
	}
}
