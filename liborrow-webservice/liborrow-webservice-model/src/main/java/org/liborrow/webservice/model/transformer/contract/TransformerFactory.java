package org.liborrow.webservice.model.transformer.contract;

public interface TransformerFactory {
	BookTransformer getBookTransformer();
	void setBookTransformer(BookTransformer bookTransformer);
	AuthorTransformer getAuthorTransformer();
	void setAuthorTransformer(AuthorTransformer authorTransformer);
	BorrowTransformer getBorrowTransformer();
	void setBorrowTransformer(BorrowTransformer borrowTransformer);
	CitizenshipTransformer getCitizenshipTransformer();
	void setCitizenshipTransformer(CitizenshipTransformer citizenshipTransformer);
	MagazineTransformer getMagazineTransformer();
	void setMagazineTransformer(MagazineTransformer magazineTransformer);
	UserLightTransformer getUserLightTransformer();
	void setUserLightTransformer(UserLightTransformer userLightTransformer);
	ImageTransformer getImageTransformer();
	void setImageTransformer(ImageTransformer imageTransformer);
}
