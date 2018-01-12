package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.itemservice.Book;

public interface BookManager {
	Book getBookById(Integer id);
}
