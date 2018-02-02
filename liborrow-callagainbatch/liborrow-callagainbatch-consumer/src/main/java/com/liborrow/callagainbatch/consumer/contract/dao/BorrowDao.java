package com.liborrow.callagainbatch.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.BorrowDTO;

import java.util.List;

public interface BorrowDao {
	List<BorrowDTO> findLateBorrows();
}
