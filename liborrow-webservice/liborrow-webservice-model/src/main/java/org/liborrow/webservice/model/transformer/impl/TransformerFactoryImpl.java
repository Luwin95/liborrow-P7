package org.liborrow.webservice.model.transformer.impl;

import org.liborrow.webservice.model.transformer.contract.AuthorTransformer;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.MagazineTransformer;
import org.liborrow.webservice.model.transformer.contract.TransformerFactory;

public class TransformerFactoryImpl implements TransformerFactory {
	BookTransformer bookTransformer;
	AuthorTransformer authorTransformer;
	BorrowTransformer borrowTransformer;
	CitizenshipTransformer citizenshipTransformer;
	MagazineTransformer magazineTransformer;
	
	public BookTransformer getBookTransformer() {
		return bookTransformer;
	}
	
	public void setBookTransformer(BookTransformer bookTransformer) {
		this.bookTransformer = bookTransformer;
	}
	
	public AuthorTransformer getAuthorTransformer() {
		return authorTransformer;
	}
	
	public void setAuthorTransformer(AuthorTransformer authorTransformer) {
		this.authorTransformer = authorTransformer;
	}

	public BorrowTransformer getBorrowTransformer() {
		return borrowTransformer;
	}

	public void setBorrowTransformer(BorrowTransformer borrowTransformer) {
		this.borrowTransformer = borrowTransformer;
	}

	public CitizenshipTransformer getCitizenshipTransformer() {
		return citizenshipTransformer;
	}

	public void setCitizenshipTransformer(CitizenshipTransformer citizenshipTransformer) {
		this.citizenshipTransformer = citizenshipTransformer;
	}

	public MagazineTransformer getMagazineTransformer() {
		return magazineTransformer;
	}

	public void setMagazineTransformer(MagazineTransformer magazineTransformer) {
		this.magazineTransformer = magazineTransformer;
	}
	
	
}
