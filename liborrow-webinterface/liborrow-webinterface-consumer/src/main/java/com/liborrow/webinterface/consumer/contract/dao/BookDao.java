package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.itemservice.Book;

public interface BookDao {
	Book find(Integer id);
}
