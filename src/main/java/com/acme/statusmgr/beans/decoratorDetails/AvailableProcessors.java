package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;
import com.acme.statusmgr.beans.controller;

public class AvailableProcessors extends BaseDecorator{
    final int requestCost = 3;

    public AvailableProcessors(controller ss) {
        super(ss);
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getContentHeader() {
        return ss.getContentHeader();
    }

    @Override
    public String getStatusDesc(){
        return ss.getStatusDesc() + ", and there are " + Runtime.getRuntime().availableProcessors() + " processors available";
    }

    @Override
    public Integer getRequestCost(){
        return ss.getRequestCost() + requestCost;
    }
}
