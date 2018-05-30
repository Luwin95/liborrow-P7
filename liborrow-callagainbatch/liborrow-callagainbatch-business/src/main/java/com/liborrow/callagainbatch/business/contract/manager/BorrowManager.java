package com.liborrow.callagainbatch.business.contract.manager;

import java.util.List;
import java.util.Map;

import com.liborrow.webinterface.generated.model.BorrowDTO;

public interface BorrowManager {
	List<BorrowDTO> findLateBorrows();
	List<BorrowDTO> remindBorrows();
	Map<String, List<String>> createChunkContextMap (List<BorrowDTO> borrows);
	void saveBorrowsRecallDate(List<BorrowDTO> borrows);
}
