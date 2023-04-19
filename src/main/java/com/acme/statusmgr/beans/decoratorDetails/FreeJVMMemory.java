package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;

public class FreeJVMMemory extends BaseDecorator{
    final int requestCost = 7;

    public FreeJVMMemory(ServerStatus ss) {
        super(ss);
    }

    @Override
    public String getStatusDesc(){
        return super.getStatusDesc() + ", and there are " + Runtime.getRuntime().freeMemory() + " bytes of JVM memory free";
    }

    @Override
    public Integer getRequestCost(){
        return super.getRequestCost() + requestCost;
    }
}
