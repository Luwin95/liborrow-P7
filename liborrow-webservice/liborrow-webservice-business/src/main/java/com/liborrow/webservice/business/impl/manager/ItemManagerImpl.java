package com.liborrow.webservice.business.impl.manager;

import javax.annotation.Resource;

import org.liborrow.webservice.model.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.consumer.repository.ItemRepository;


@Service
public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	@Autowired
	@Resource
	ItemRepository itemRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Item findItemById(long id)
	{
		return itemRepository.findOne(id);
	}

}
