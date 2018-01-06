package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.MagazineManager;
import com.liborrow.webservice.consumer.repository.MagazineRepository;

@Service
public class MagazineManagerImpl implements MagazineManager {
	@Autowired
	@Resource
	MagazineRepository magazineRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Magazine findMagazineById(long id)
	{
		Magazine magazine = magazineRepository.findOne(id);
		magazineEntityHibernateInitialization(magazine);
		return magazine;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Magazine> findAllMagazines()
	{
		List<Magazine> magazines = magazineRepository.findAll();
		for(Magazine magazine : magazines)
		{
			magazineEntityHibernateInitialization(magazine);
		}
		return magazines;
	}
	
	public void magazineEntityHibernateInitialization(Magazine magazine)
	{
		Hibernate.initialize(magazine.getBorrows());
		for(Borrow borrow : magazine.getBorrows())
		{
			Hibernate.initialize(borrow.getBorrower());
			Hibernate.initialize(borrow.getItems());
			Hibernate.initialize(borrow.getBorrower().getCitizenship());
		}
	}
}
