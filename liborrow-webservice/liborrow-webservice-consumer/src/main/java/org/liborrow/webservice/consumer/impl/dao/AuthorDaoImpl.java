package org.liborrow.webservice.consumer.impl.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.AuthorDao;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;

public class AuthorDaoImpl extends AbstractDaoImpl implements AuthorDao {
	@Override
	public Set<Author> searchAuthor(ItemCriterias itemCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct author FROM Author AS author JOIN FETCH author.books JOIN FETCH author.citizenships WHERE 1=1 ");
		if(itemCriterias.getAuthorCriterias().getFirstname()!=null && !itemCriterias.getAuthorCriterias().getFirstname().equals("") )
		{
			queryString.append("AND (firstname LIKE :firstname ");
			queryString.append("OR firstname LIKE :firstnameupper ");
			queryString.append("OR firstname LIKE :firstnamelower ");
			queryString.append("OR firstname LIKE :firstnamewithfirstupper) ");
		}
		
		if(itemCriterias.getAuthorCriterias().getLastname() !=null && !itemCriterias.getAuthorCriterias().getLastname().equals("") )
		{
			queryString.append("AND (name LIKE :lastname ");
			queryString.append("OR name LIKE :lastnameupper ");
			queryString.append("OR name LIKE :lastnamelower ");
			queryString.append("OR name LIKE :lastnamewithfirstupper) ");
		}
		
		if(itemCriterias.getAuthorCriterias().getBirth() !=0)
		{
			queryString.append("AND birth LIKE :birth ");
		}
		
		if(itemCriterias.getAuthorCriterias().getDeath() !=0)
		{
			queryString.append("AND death LIKE :death ");
		}
		
		Query query = getEm().createQuery(queryString.toString());
		
		if(itemCriterias.getAuthorCriterias().getFirstname() !=null)
		{
			query.setParameter("firstname", "%"+itemCriterias.getAuthorCriterias().getFirstname()+"%");
			query.setParameter("firstnameupper", "%"+itemCriterias.getAuthorCriterias().getFirstname().toUpperCase()+"%");
			query.setParameter("firstnamelower", "%"+itemCriterias.getAuthorCriterias().getFirstname().toLowerCase()+"%");
			query.setParameter("firstnamewithfirstupper", "%"+itemCriterias.getAuthorCriterias().getFirstname().substring(0, 1).toUpperCase()+itemCriterias.getAuthorCriterias().getFirstname().substring(1).toLowerCase()+"%");
		}
		
		if(itemCriterias.getAuthorCriterias().getLastname() !=null)
		{
			query.setParameter("lastname", "%"+itemCriterias.getAuthorCriterias().getLastname()+"%");
			query.setParameter("lastnameupper", "%"+itemCriterias.getAuthorCriterias().getLastname().toUpperCase()+"%");
			query.setParameter("lastnamelower", "%"+itemCriterias.getAuthorCriterias().getLastname().toLowerCase()+"%");
			query.setParameter("lastnamewithfirstupper", "%"+itemCriterias.getAuthorCriterias().getLastname().substring(0, 1).toUpperCase()+itemCriterias.getAuthorCriterias().getFirstname().substring(1).toLowerCase()+"%");
		}
		
		if(itemCriterias.getAuthorCriterias().getBirth() !=0)
		{
			query.setParameter("birth", 
					getUtilsFactory().getConvertersFactory().getDateConverter()
					.convertYearIntToDate(itemCriterias.getAuthorCriterias().getBirth()));
		}
		
		if(itemCriterias.getAuthorCriterias().getDeath() !=0)
		{
			query.setParameter("birth", 
					getUtilsFactory().getConvertersFactory().getDateConverter()
					.convertYearIntToDate(itemCriterias.getAuthorCriterias().getDeath()));
		}
		
		Set<Author> authors = new HashSet<>();
		authors.addAll(query.getResultList());
		return authors;
	}
	
	@Override
	public Set<Author> searchWithSimpleStringAuthor(ItemCriterias itemCriterias, String[] simpleStringSplited) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT distinct author FROM Author AS author JOIN FETCH author.books JOIN FETCH author.citizenships WHERE 1=0 ");
		for(String string : simpleStringSplited)
		{
			queryString.append("OR firstname LIKE :firstname"+string+" ");
			queryString.append("OR firstname LIKE :firstnameupper"+string+" ");
			queryString.append("OR firstname LIKE :firstnamelower"+string+" ");
			queryString.append("OR firstname LIKE :firstnamewithfirstupper"+string+" ");
			queryString.append("OR name LIKE :lastname"+string+" ");
			queryString.append("OR name LIKE :lastnameupper"+string+" ");
			queryString.append("OR name LIKE :lastnamelower"+string+" ");
			queryString.append("OR name LIKE :lastnamewithfirstupper"+string+" ");
		}
		
		Query query = getEm().createQuery(queryString.toString());
		
		for(String string : simpleStringSplited)
		{
			query.setParameter("firstname"+string, "%"+string+"%");
			query.setParameter("firstnameupper"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("firstnamelower"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("firstnamewithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
			query.setParameter("lastname"+string, "%"+string+"%");
			query.setParameter("lastnameupper"+string, "%"+string.toUpperCase()+"%");
			query.setParameter("lastnamelower"+string, "%"+string.toLowerCase()+"%");
			query.setParameter("lastnamewithfirstupper"+string, "%"+string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase()+"%");
		}
		
		Set<Author> authors = new HashSet<>();
		authors.addAll(query.getResultList());
		return authors;
	}
}
