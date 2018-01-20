package org.liborrow.webservice.consumer.impl.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.MagazineDao;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public class MagazineDaoImpl implements MagazineDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Set<Magazine> searchMagazine(ItemCriterias itemCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct magazine FROM Magazine AS magazine JOIN FETCH magazine.borrows WHERE 1=1");
		if(itemCriterias.getMagazineCriterias().getName()!=null && !itemCriterias.getMagazineCriterias().getName().equals(""))
		{
			queryString.append("AND (magazine.name LIKE :name ");
			queryString.append("OR magazine.name LIKE :nameupper ");
			queryString.append("OR magazine.name LIKE :namelower ");
			queryString.append("OR magazine.name LIKE :namewithfirstupper) ");
		}
		if(itemCriterias.getMagazineCriterias().getPublishDate()!=null)
		{
			queryString.append("AND magazine.publishDate LIKE :publishdate ");
		}
		if(itemCriterias.getMagazineCriterias().getEditionNumber() >0)
		{
			queryString.append("AND magazine.editionNumber = :editionnumber ");
		}
		if(itemCriterias.getItemRef() !=null && !itemCriterias.getItemRef().equals(""))
		{
			queryString.append("AND (magazine.itemRef LIKE :itemref ");
			queryString.append("OR magazine.itemRef LIKE :itemrefupper ");
			queryString.append("OR magazine.itemRef LIKE :itemreflower ");
			queryString.append("OR magazine.itemRef LIKE :itemrefwithfirstupper) ");
		}
		
		Query query = em.createQuery(queryString.toString());
		
		if(itemCriterias.getMagazineCriterias().getName()!=null && !itemCriterias.getMagazineCriterias().getName().equals(""))
		{
			query.setParameter("name", "%"+itemCriterias.getMagazineCriterias().getName()+"%");
			query.setParameter("nameupper", "%"+itemCriterias.getMagazineCriterias().getName().toUpperCase()+"%");
			query.setParameter("namelower", "%"+itemCriterias.getMagazineCriterias().getName().toLowerCase()+"%");
			query.setParameter("namewithfirstupper", "%"+itemCriterias.getMagazineCriterias().getName().substring(0, 1).toUpperCase()+itemCriterias.getMagazineCriterias().getName().substring(1).toLowerCase()+"%");
		}
		if(itemCriterias.getMagazineCriterias().getPublishDate()!=null)
		{
			query.setParameter("publishdate", itemCriterias.getMagazineCriterias().getPublishDate());
		}
		if(itemCriterias.getMagazineCriterias().getEditionNumber() >0)
		{
			query.setParameter("editionnumber", itemCriterias.getMagazineCriterias().getEditionNumber());
		}
		if(itemCriterias.getItemRef() !=null && !itemCriterias.getItemRef().equals(""))
		{
			query.setParameter("itemref", "%"+itemCriterias.getItemRef()+"%");
			query.setParameter("itemrefupper", "%"+itemCriterias.getItemRef().toUpperCase()+"%");
			query.setParameter("itemreflower", "%"+itemCriterias.getItemRef().toLowerCase()+"%");
			query.setParameter("itemrefwithfirstupper", "%"+itemCriterias.getItemRef().substring(0, 1).toUpperCase()+itemCriterias.getItemRef().substring(1).toLowerCase()+"%");
		}
		
		Set<Magazine> magazines = new HashSet<>();
		magazines.addAll(query.getResultList());
		return  magazines;
	}
	
	@Override
	public Set<Magazine> searchWithSimpleStringMagazine(ItemCriterias itemCriterias, String[] simpleStringSplited) {
		
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct magazine FROM Magazine AS magazine JOIN FETCH magazine.borrows WHERE 1=0");
		
		for(String string : simpleStringSplited)
		{
			queryString.append("OR magazine.name LIKE :name"+string+" ");
			queryString.append("OR magazine.name LIKE :nameupper"+string+" ");
			queryString.append("OR magazine.name LIKE :namelower"+string+" ");
			queryString.append("OR magazine.name LIKE :namewithfirstupper"+string+" ");
			queryString.append("OR magazine.itemRef LIKE :itemref"+string+" ");
			queryString.append("OR magazine.itemRef LIKE :itemrefupper"+string+" ");
			queryString.append("OR magazine.itemRef LIKE :itemreflower"+string+" ");
			queryString.append("OR magazine.itemRef LIKE :itemrefwithfirstupper"+string+" ");
		}
		Query query = em.createQuery(queryString.toString());
		for(String string : simpleStringSplited)
		{
			query.setParameter("name"+string, "%"+string+"%");
			query.setParameter("nameupper"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("namelower"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("namewithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
			query.setParameter("itemref"+string, "%"+string+"%");
			query.setParameter("itemrefupper"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("itemreflower"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("itemrefwithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
		}
		Set<Magazine> magazines = new HashSet<>();
		magazines.addAll(query.getResultList());
		return  magazines;
	}
}
