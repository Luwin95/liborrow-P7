package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.itemservice.BookDTO;

public interface BookDao {
	BookDTO find(Integer id);
}
