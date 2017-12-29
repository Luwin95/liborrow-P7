package com.liborrow.webservice.business.impl.manager;

import java.util.List;

import javax.annotation.Resource;
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
		return magazineRepository.findOne(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Magazine> findAllMagazines()
	{
		return magazineRepository.findAll();
	}
}
