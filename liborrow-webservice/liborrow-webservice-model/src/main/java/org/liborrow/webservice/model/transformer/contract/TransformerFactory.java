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
}
