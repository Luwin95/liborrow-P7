package org.liborrow.webservice.model.utilsobject;

import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Magazine;

public class SearchResponse {

	private List<BookDTO> books;
	private List<Magazine> magazines;
	private List<AuthorDTO> authors;
	
	public List<BookDTO> getBooks() {
		return books;
	}
	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	public List<Magazine> getMagazines() {
		return magazines;
	}
	public void setMagazines(List<Magazine> magazines) {
		this.magazines = magazines;
	}
	public List<AuthorDTO> getAuthors() {
		return authors;
	}
	public void setAuthors(List<AuthorDTO> authors) {
		this.authors = authors;
	}
	
}
