package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.MagazineManager;
import com.liborrow.webservice.consumer.repository.MagazineRepository;

@Service
public class MagazineManagerImpl extends AbstractManagerImpl implements MagazineManager {
	@Autowired
	@Resource
	MagazineRepository magazineRepository;
	
	@Override
	@Transactional(readOnly = true)
	public MagazineDTO findMagazineById(long id)
	{
		Magazine magazine = magazineRepository.findOne(id);
		magazineEntityHibernateInitialization(magazine);
		MagazineDTO magazineDTO = getTransformerFactory().getMagazineTransformer().toMagazineDTO(magazine, true, "MagazineDTO");
		return magazineDTO;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<MagazineDTO> findAllMagazines()
	{
		Set<Magazine> magazines = new HashSet<>(); 
		magazines.addAll(magazineRepository.findAll());
		magazinesEntityHibernateInitialization(magazines);
		List <MagazineDTO> magazinesDTO = new ArrayList<>();
		magazinesDTO.addAll(getTransformerFactory().getMagazineTransformer().toMagazinesDTO(magazines, true, "MagazineDTO"));
		return magazinesDTO;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<MagazineDTO> searchMagazine(ItemCriterias itemCriterias) {
		Set<Magazine> magazines = getDaoFactory().getMagazineDao().searchMagazine(itemCriterias);
		magazinesEntityHibernateInitialization(magazines);
		List<MagazineDTO> magazinesDTO = new ArrayList<>();
		if(magazines !=null && magazines.size()!=0)
		{
			magazinesDTO.addAll(getTransformerFactory().getMagazineTransformer().toMagazinesDTO(magazines, true, "org.liborrow.webservice.model.dto.MagazineDTO"));
		}
		formatMagazineResponse(magazinesDTO);
		return magazinesDTO;
	}
	
	@Override
	public void createMagazine(MagazineDTO magazine) {
		Magazine magazineEntity = getTransformerFactory().getMagazineTransformer().toMagazineEntity(magazine, true, Magazine.class.getSimpleName());
		magazineRepository.save(magazineEntity);
	}
	
	@Override
	public void updateMagazine(MagazineDTO magazine) {
		Magazine magazineEntity = getTransformerFactory().getMagazineTransformer().toMagazineEntity(magazine, true, Magazine.class.getSimpleName());
		magazineRepository.save(magazineEntity);
	}
	
	@Override
	public void deleteMagazine(MagazineDTO magazine) {
		Magazine magazineEntity = getTransformerFactory().getMagazineTransformer().toMagazineEntity(magazine, true, Magazine.class.getSimpleName());
		magazineRepository.delete(magazineEntity);
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
	
	
}
