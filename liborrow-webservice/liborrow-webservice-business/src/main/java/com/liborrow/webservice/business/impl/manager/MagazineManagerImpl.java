package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import org.liborrow.webservice.model.entities.Magazine;
import org.springframework.beans.factory.annotation.Autowired;

import com.liborrow.webservice.business.contract.manager.MagazineManager;
import com.liborrow.webservice.consumer.repository.MagazineRepository;

public class MagazineManagerImpl implements MagazineManager {
	@Autowired
	MagazineRepository magazineRepository;
	
	public Magazine findMagazineById(long id)
	{
		return magazineRepository.findOne(id);
	}
	
	public List<Magazine> findAllMagazines()
	{
		return magazineRepository.findAll();
	}
}
