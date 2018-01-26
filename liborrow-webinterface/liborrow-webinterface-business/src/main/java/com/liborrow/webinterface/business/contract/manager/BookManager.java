package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.BookDTO;

public interface BookManager {
	BookDTO getBookById(Integer id);
}
