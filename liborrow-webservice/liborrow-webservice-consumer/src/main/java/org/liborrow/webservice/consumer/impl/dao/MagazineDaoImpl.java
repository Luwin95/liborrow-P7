package org.liborrow.webservice.consumer.impl.dao;

import java.util.List;

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
	public List<Magazine> searchMagazine(ItemCriterias itemCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT magazine FROM Magazine AS magazine WHERE 1=1 ");
		if(!itemCriterias.getMagazineCriterias().getName().equals(""))
		{
			queryString.append("magazine.name LIKE :name ");
		}
		if(itemCriterias.getMagazineCriterias().getPublishDate()!=null)
		{
			queryString.append("magazine.publishDate LIKE :publishdate ");
		}
		if(itemCriterias.getMagazineCriterias().getEditionNumber() >0)
		{
			queryString.append("magazine.editionNumber = :editionnumber ");
		}
		
		Query query = em.createQuery(queryString.toString());
		
		if(!itemCriterias.getMagazineCriterias().getName().equals(""))
		{
			query.setParameter("name", itemCriterias.getMagazineCriterias().getName());
		}
		if(itemCriterias.getMagazineCriterias().getPublishDate()!=null)
		{
			query.setParameter("publishdate", itemCriterias.getMagazineCriterias().getPublishDate());
		}
		if(itemCriterias.getMagazineCriterias().getEditionNumber() >0)
		{
			query.setParameter("editionnumber", itemCriterias.getMagazineCriterias().getName());
		}
		
		return (List <Magazine>) query.getResultList();
	}
}
