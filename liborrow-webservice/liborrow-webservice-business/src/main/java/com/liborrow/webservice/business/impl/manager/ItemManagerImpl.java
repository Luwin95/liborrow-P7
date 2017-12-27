package com.liborrow.webservice.business.impl.manager;

import org.liborrow.webservice.model.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;

import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.consumer.repository.ItemRepository;

public class ItemManagerImpl implements ItemManager {
	@Autowired
	ItemRepository itemRepository;
	
	public Item findItemById(long id)
	{
		return itemRepository.findOne(id);
	}

}
