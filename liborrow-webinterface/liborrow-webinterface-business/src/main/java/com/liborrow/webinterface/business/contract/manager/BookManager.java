package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.itemService.Book;

public interface BookManager {
	Book getBookById(Integer id);
}
