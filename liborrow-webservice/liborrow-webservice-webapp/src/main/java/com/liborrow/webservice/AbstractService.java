package com.liborrow.webservice;

import com.liborrow.webservice.business.contract.ManagerFactory;

public abstract class AbstractService {
	private static ManagerFactory managerFactory;
	
	protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
	
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
