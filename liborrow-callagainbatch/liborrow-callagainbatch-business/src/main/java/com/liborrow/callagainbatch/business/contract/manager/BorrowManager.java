package com.liborrow.callagainbatch.business.contract.manager;

import java.util.List;
import com.liborrow.webinterface.generated.model.BorrowDTO;

public interface BorrowManager {
	List<BorrowDTO> findLateBorrows();
	
}
