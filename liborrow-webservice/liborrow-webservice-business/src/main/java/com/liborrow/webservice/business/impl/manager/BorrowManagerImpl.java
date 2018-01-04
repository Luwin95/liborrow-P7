package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.BorrowManager;
import com.liborrow.webservice.consumer.repository.BorrowRepository;
import com.liborrow.webservice.consumer.repository.UserRepository;

@Transactional
public class BorrowManagerImpl implements BorrowManager {
	@Autowired
	BorrowRepository borrowRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public Borrow findBorrowById(long id)
	{
		return borrowRepository.findOne(id);
	}
	
	@Override
	public List<Borrow> findBorrowByUser(long userId)
	{
		if(userId != 0)
		{
			User user = userRepository.findOne(userId);
			if(user != null)
			{
				return null; /*borrowRepository.findByBorrower(user);*/
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
		return borrowRepository.findAll();
	}
}
