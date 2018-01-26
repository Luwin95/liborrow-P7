package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.BookDTO;

public interface BookDao {
	BookDTO find(Integer id);
}
