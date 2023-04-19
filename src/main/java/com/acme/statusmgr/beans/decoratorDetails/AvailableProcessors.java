package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;

public class AvailableProcessors extends BaseDecorator{
    final int requestCost = 3;

    public AvailableProcessors(ServerStatus ss) {
        super(ss);
    }

    @Override
    public String getStatusDesc(){
        return super.getStatusDesc() + ", and there are " + Runtime.getRuntime().availableProcessors() + " processors available";
    }

    @Override
    public Integer getRequestCost(){
        return super.getRequestCost() + requestCost;
    }
}
