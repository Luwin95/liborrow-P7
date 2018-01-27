package org.liborrow.webservice.consumer.impl.dao;

import org.liborrow.webservice.consumer.contract.dao.BorrowDao;
import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.springframework.beans.factory.annotation.Autowired;

import com.liborrow.webservice.consumer.repository.BorrowRepository;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDao {

	@Autowired
	BorrowRepository borrowRepository;
	
	@Override
	public void markAsExtended(Borrow borrow) {
		borrow.setExtended(true);
		getEm().merge(borrow);
		getEm().flush();
	}
}
