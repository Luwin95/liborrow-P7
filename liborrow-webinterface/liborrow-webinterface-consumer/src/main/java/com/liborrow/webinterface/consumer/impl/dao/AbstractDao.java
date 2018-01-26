package com.liborrow.webinterface.consumer.impl.dao;

import com.liborrow.webinterface.generated.model.BorrowClient;
import com.liborrow.webinterface.generated.model.BorrowService;
import com.liborrow.webinterface.generated.model.ItemClient;
import com.liborrow.webinterface.generated.model.ItemService;
import com.liborrow.webinterface.generated.model.UserClient;
import com.liborrow.webinterface.generated.model.UserService;

public abstract class AbstractDao {
	private ItemService itemService = new ItemService();
	private ItemClient itemSrv = itemService.getItemPort();
	
	private UserService userService = new UserService();
	private UserClient userSrv = userService.getUserPort();
	
	private BorrowService borrowService = new BorrowService();
	private BorrowClient borrowSrv = borrowService.getBorrowPort();
	
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
	
	protected UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	protected UserClient getUserSrv() {
		return userSrv;
	}
	public void setUserSrv(UserClient userSrv) {
		this.userSrv = userSrv;
	}
	public BorrowClient getBorrowSrv() {
		return borrowSrv;
	}
	public void setBorrowSrv(BorrowClient borrowSrv) {
		this.borrowSrv = borrowSrv;
	}
}
