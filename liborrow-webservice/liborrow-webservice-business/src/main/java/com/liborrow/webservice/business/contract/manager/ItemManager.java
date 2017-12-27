package com.liborrow.webservice.business.contract.manager;

import org.liborrow.webservice.model.entities.Item;

public interface ItemManager {
	Item findItemById(long id);
}
