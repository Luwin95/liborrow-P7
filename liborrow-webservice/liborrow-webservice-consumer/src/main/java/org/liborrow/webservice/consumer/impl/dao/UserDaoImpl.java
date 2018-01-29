package org.liborrow.webservice.consumer.impl.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.liborrow.webservice.consumer.contract.dao.UserDao;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.utilsobject.UserCriterias;

public class UserDaoImpl extends AbstractDaoImpl implements UserDao{
	@Override
	public Set<UserLight> searchUser(UserCriterias userCriterias) {
		StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT user FROM UserLight AS user WHERE 1=1 ");
		if(null != userCriterias.getAddress() && !userCriterias.getAddress().equals(""))
		{
			queryString.append("AND (user.address LIKE :address ");
			queryString.append("OR user.address LIKE :addresslower ");
			queryString.append("OR user.address LIKE :addressupper ");
			queryString.append("OR user.address LIKE :addresswithfirstupper) ");
		}
		if(null != userCriterias.getEmail() && !userCriterias.getEmail().equals(""))
		{
			queryString.append("AND (user.email LIKE :email ");
			queryString.append("OR user.email LIKE :emaillower ");
			queryString.append("OR user.email LIKE :emailupper ");
			queryString.append("OR user.email LIKE :emailwithfirstupper) ");
		}
		if(null != userCriterias.getFirstname() && !userCriterias.getFirstname().equals(""))
		{
			queryString.append("AND (user.firstname LIKE :firstname ");
			queryString.append("OR user.firstname LIKE :firstnamelower ");
			queryString.append("OR user.firstname LIKE :firstnameupper ");
			queryString.append("OR user.firstname LIKE :firstnamewithfirstupper) ");
		}
		if(null != userCriterias.getLastname() && !userCriterias.getLastname().equals(""))
		{
			queryString.append("AND (user.lastname LIKE :lastname ");
			queryString.append("OR user.lastname LIKE :lastnamelower ");
			queryString.append("OR user.lastname LIKE :lastnameupper ");
			queryString.append("OR user.lastname LIKE :lastnamewithfirstupper) ");
		}
		if(null != userCriterias.getPhoneNumber() && !userCriterias.getPhoneNumber().equals(""))
		{
			queryString.append("AND (user.phoneNumber LIKE :phoneNumber ");
		}
		if(null != userCriterias.getPostCode() && !userCriterias.getPostCode().equals(""))
		{
			queryString.append("AND (user.postCode LIKE :postCode ");
		}
		
		Query query = getEm().createQuery(queryString.toString());
		
		if(null != userCriterias.getAddress() && !userCriterias.getAddress().equals(""))
		{
			query.setParameter("address", "%"+userCriterias.getAddress()+"%");
			query.setParameter("addresslower", "%"+userCriterias.getAddress().toLowerCase()+"%");
			query.setParameter("addressupper", "%"+userCriterias.getAddress().toUpperCase()+"%");
			query.setParameter("addresswithfirstupper", "%"+userCriterias.getAddress().substring(0, 1).toUpperCase()+userCriterias.getAddress().substring(1).toLowerCase()+"%");
		}
		if(null != userCriterias.getEmail() && !userCriterias.getEmail().equals(""))
		{
			query.setParameter("email", "%"+userCriterias.getEmail()+"%");
			query.setParameter("emaillower", "%"+userCriterias.getEmail().toLowerCase()+"%");
			query.setParameter("emailupper", "%"+userCriterias.getEmail().toUpperCase()+"%");
			query.setParameter("emailwithfirstupper", "%"+userCriterias.getEmail().substring(0, 1).toUpperCase()+userCriterias.getEmail().substring(1).toLowerCase()+"%");
		}
		if(null != userCriterias.getFirstname() && !userCriterias.getFirstname().equals(""))
		{
			query.setParameter("firstname", "%"+userCriterias.getFirstname()+"%");
			query.setParameter("firstnamelower", "%"+userCriterias.getFirstname().toLowerCase()+"%");
			query.setParameter("firstnameupper", "%"+userCriterias.getFirstname().toUpperCase()+"%");
			query.setParameter("firstnamewithfirstupper", "%"+userCriterias.getFirstname().substring(0, 1).toUpperCase()+userCriterias.getFirstname().substring(1).toLowerCase()+"%");
		}
		if(null != userCriterias.getLastname() && !userCriterias.getLastname().equals(""))
		{
			query.setParameter("lastname", "%"+userCriterias.getLastname()+"%");
			query.setParameter("lastnamelower", "%"+userCriterias.getLastname().toLowerCase()+"%");
			query.setParameter("lastnameupper", "%"+userCriterias.getLastname().toUpperCase()+"%");
			query.setParameter("lastnamewithfirstupper", "%"+userCriterias.getLastname().substring(0, 1).toUpperCase()+userCriterias.getLastname().substring(1).toLowerCase()+"%");
		}
		if(null != userCriterias.getPhoneNumber() && !userCriterias.getPhoneNumber().equals(""))
		{
			query.setParameter("phoneNumber", userCriterias.getPhoneNumber());
		}
		if(null != userCriterias.getPostCode() && !userCriterias.getPostCode().equals(""))
		{
			query.setParameter("postCode", userCriterias.getPostCode());
		}
		Set <UserLight> users = new HashSet<>();
		users.addAll(query.getResultList());
		return users;
	}

}
