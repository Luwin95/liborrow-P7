package com.liborrow.webservice.business.impl.manager;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.liborrow.webservice.consumer.contract.DaoFactory;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.ItemDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.transformer.contract.TransformerFactory;
import org.liborrow.webservice.model.utilsobject.SearchResponse;

public abstract class AbstractManagerImpl {

	private DaoFactory daoFactory;
	private TransformerFactory transformerFactory;

	protected DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public TransformerFactory getTransformerFactory() {
		return transformerFactory;
	}

	public void setTransformerFactory(TransformerFactory transformerFactory) {
		this.transformerFactory = transformerFactory;
	}
	
	protected void formatSearchResponse(SearchResponse searchResponse) {
		formatBookResponse(searchResponse.getBooks());
		formatMagazineResponse(searchResponse.getMagazines());
	}
	
	protected void formatBookResponse(List<BookDTO> books) {
		for(BookDTO book : books) {
			if(book.getRemainingCount()==0) {
				Calendar nextReturn = Calendar.getInstance();
				nextReturn.setTime(nextGetBackDate(book));
				book.setNextReturn(nextReturn);
				book.setReservationsNumber(getNumberOfReservations(book));
			}
		}
	}
	
	protected void formatMagazineResponse(List<MagazineDTO> magazines) {
		for(MagazineDTO magazine : magazines) {
			if(magazine.getRemainingCount()==0) {
				Calendar nextReturn = Calendar.getInstance();
				nextReturn.setTime(nextGetBackDate(magazine));
				magazine.setNextReturn(nextReturn);
				magazine.setReservationsNumber(getNumberOfReservations(magazine));
			}
		}
	}
	
	protected Date nextGetBackDate(ItemDTO item) {
		Date nextGetBackDate = new Date();
		for(BorrowDTO borrow : item.getBorrows()) {
			if(new Date() != nextGetBackDate){
				nextGetBackDate = borrow.getEndDate().compareTo(nextGetBackDate)<0 ? borrow.getEndDate() : nextGetBackDate;
			}else {
				nextGetBackDate = borrow.getEndDate();
			}
		}
		return nextGetBackDate;
	}
	
	
	
	protected Long getNumberOfReservations(ItemDTO item) {
		return getDaoFactory().getWaitingListDao().getWaitingListSize(item.getId());
	}
	
	
}
