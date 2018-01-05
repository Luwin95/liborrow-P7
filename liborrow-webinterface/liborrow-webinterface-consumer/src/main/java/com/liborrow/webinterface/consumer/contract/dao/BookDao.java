package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.itemService.Book;

public interface BookDao {
	Book find(Integer id);
}
