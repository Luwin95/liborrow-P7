package com.liborrow.callagainbatch.consumer.contract;

import com.liborrow.callagainbatch.consumer.contract.dao.BorrowDao;

public interface DaoFactory {

	BorrowDao getBorrowDao();
	void setBorrowDao(BorrowDao borrowDao);
}
