package org.liborrow.webservice.model.transformer.contract;

import java.util.Set;

import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.entities.Book;

public interface BookTransformer {
	BookDTO toBookDTO(Book book, boolean isParent, String classParentName);
	Set<BookDTO> toBooksDTO(Set<Book> books, boolean isParent, String classParentName);
}
