package org.liborrow.webservice.model.transformer.impl;

import org.liborrow.webservice.model.transformer.contract.AuthorTransformer;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.ImageTransformer;
import org.liborrow.webservice.model.transformer.contract.MagazineTransformer;
import org.liborrow.webservice.model.transformer.contract.TransformerFactory;
import org.liborrow.webservice.model.transformer.contract.UserAccountTransformer;
import org.liborrow.webservice.model.transformer.contract.UserLightTransformer;
import org.liborrow.webservice.model.transformer.contract.WaitingListTransformer;

public class TransformerFactoryImpl implements TransformerFactory {
	BookTransformer bookTransformer;
	AuthorTransformer authorTransformer;
	BorrowTransformer borrowTransformer;
	CitizenshipTransformer citizenshipTransformer;
	MagazineTransformer magazineTransformer;
	ImageTransformer imageTransformer;
	UserLightTransformer userLightTransformer;
	UserAccountTransformer userAccountTransformer;
	WaitingListTransformer waitingListTransformer;
	
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

	public UserLightTransformer getUserLightTransformer() {
		return userLightTransformer;
	}

	public void setUserLightTransformer(UserLightTransformer userLightTransformer) {
		this.userLightTransformer = userLightTransformer;
	}

	public ImageTransformer getImageTransformer() {
		return imageTransformer;
	}

	public void setImageTransformer(ImageTransformer imageTransformer) {
		this.imageTransformer = imageTransformer;
	}

	public UserAccountTransformer getUserAccountTransformer() {
		return userAccountTransformer;
	}

	public void setUserAccountTransformer(UserAccountTransformer userAccountTransformer) {
		this.userAccountTransformer = userAccountTransformer;
	}

	public WaitingListTransformer getWaitingListTransformer() {
		return waitingListTransformer;
	}

	public void setWaitingListTransformer(WaitingListTransformer waitingListTransformer) {
		this.waitingListTransformer = waitingListTransformer;
	}
	
}
