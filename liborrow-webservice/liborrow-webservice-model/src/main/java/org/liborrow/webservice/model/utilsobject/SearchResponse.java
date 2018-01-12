package org.liborrow.webservice.model.utilsobject;

import java.util.List;

import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Magazine;

public class SearchResponse {

	private List<Book> books;
	private List<Magazine> magazines;
	private List<Author> authors;
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public List<Magazine> getMagazines() {
		return magazines;
	}
	public void setMagazines(List<Magazine> magazines) {
		this.magazines = magazines;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
}
