package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.itemservice.BookDTO;

public interface BookManager {
	BookDTO getBookById(Integer id);
}
