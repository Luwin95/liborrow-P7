package org.liborrow.webservice.model.utilsobject;

import java.util.ArrayList;
import java.util.List;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.entities.Magazine;

public class SearchResponse {

	private List<BookDTO> books = new ArrayList<>();
	private List<MagazineDTO> magazines = new ArrayList<>();
	private List<AuthorDTO> authors = new ArrayList<>();
	
	public List<BookDTO> getBooks() {
		return books;
	}
	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	public List<MagazineDTO> getMagazines() {
		return magazines;
	}
	public void setMagazines(List<MagazineDTO> magazines) {
		this.magazines = magazines;
	}
	public List<AuthorDTO> getAuthors() {
		return authors;
	}
	public void setAuthors(List<AuthorDTO> authors) {
		this.authors = authors;
	}
	
}
