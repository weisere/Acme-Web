package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;

public class TempLocation extends BaseDecorator{
    final int requestCost = 29;

    public TempLocation(ServerStatus ss) {
        super(ss);
    }

    @Override
    public String getStatusDesc(){
        return super.getStatusDesc() + ", and the server's temp file location is " + System.getenv("TEMP");
    }

    @Override
    public Integer getRequestCost(){
        return super.getRequestCost() + requestCost;
    }
}
