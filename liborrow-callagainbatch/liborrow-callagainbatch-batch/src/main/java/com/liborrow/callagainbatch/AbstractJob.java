package com.liborrow.callagainbatch;

import com.liborrow.callagainbatch.business.contract.ManagerFactory;

public abstract class AbstractJob {

	private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
