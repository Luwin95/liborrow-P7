package com.liborrow.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.liborrow.webservice.model.entities.Borrow;
import com.liborrow.webservice.AbstractService;

@WebService(serviceName="borrowService")
public class BorrowService extends AbstractService {
	
	@WebMethod
	public Borrow getBorrow(long id)
	{
		return getManagerFactory().getBorrowManager().findBorrowById(id);
	}
	
	@WebMethod
	public List<Borrow> getUserBorrows(long userId)
	{
		return getManagerFactory().getBorrowManager().findBorrowByUser(userId);
	}
	
	@WebMethod
	public List<Borrow> getAllBorrows()
	{
		return getManagerFactory().getBorrowManager().findAllBorrows();
	}

}
