package org.liborrow.webservice.model.utilsobject;

public class ItemCriterias {
	private String itemRef;
	private BookCriterias bookCriterias;
	private AuthorCriterias authorCriterias;
	private MagazineCriterias magazineCriterias;
	private boolean isBookSearch;
	private boolean isMagazineSearch;
	private boolean isAuthorSearch;
	
	public ItemCriterias() {
		this.authorCriterias = new AuthorCriterias();
		this.bookCriterias = new BookCriterias();
		this.magazineCriterias = new MagazineCriterias();
	}
	
	public String getItemRef() {
		return itemRef;
	}
	public void setItemRef(String itemRef) {
		this.itemRef = itemRef;
	}
	public BookCriterias getBookCriterias() {
		return bookCriterias;
	}
	public void setBookCriterias(BookCriterias bookCriterias) {
		this.bookCriterias = bookCriterias;
	}
	public AuthorCriterias getAuthorCriterias() {
		return authorCriterias;
	}
	public void setAuthorCriterias(AuthorCriterias authorCriterias) {
		this.authorCriterias = authorCriterias;
	}
	public MagazineCriterias getMagazineCriterias() {
		return magazineCriterias;
	}
	public void setMagazineCriterias(MagazineCriterias magazineCriterias) {
		this.magazineCriterias = magazineCriterias;
	}
	public boolean isBookSearch() {
		return isBookSearch;
	}
	public void setBookSearch(boolean isBookSearch) {
		this.isBookSearch = isBookSearch;
	}
	public boolean isMagazineSearch() {
		return isMagazineSearch;
	}
	public void setMagazineSearch(boolean isMagazineSearch) {
		this.isMagazineSearch = isMagazineSearch;
	}
	public boolean isAuthorSearch() {
		return isAuthorSearch;
	}
	public void setAuthorSearch(boolean isAuthorSearch) {
		this.isAuthorSearch = isAuthorSearch;
	}
	
}
