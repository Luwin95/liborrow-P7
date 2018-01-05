package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.generated.itemService.ItemClient;
import com.liborrow.webinterface.generated.itemService.ItemService;

public abstract class AbstractDao {
	private ItemService itemService = new ItemService();
	private ItemClient itemSrv = itemService.getItemPort();
	
	protected ItemService getItemService() {
		return itemService;
	}
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	protected ItemClient getItemSrv() {
		return itemSrv;
	}
	public void setItemSrv(ItemClient itemSrv) {
		this.itemSrv = itemSrv;
	}
	
	
}
