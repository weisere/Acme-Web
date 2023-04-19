package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;

public class TotalJVMMemory extends BaseDecorator{
    final int requestCost = 13;

    public TotalJVMMemory(ServerStatus ss) {
        super(ss);
    }

    @Override
    public String getStatusDesc(){
        return super.getStatusDesc() + ", and there is a total of "+ Runtime.getRuntime().totalMemory() +" bytes of JVM memory";
    }

    @Override
    public Integer getRequestCost(){
        return super.getRequestCost() + requestCost;
    }
}
