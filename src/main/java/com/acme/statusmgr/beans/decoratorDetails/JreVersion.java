package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;

public class JreVersion extends BaseDecorator {
    final int requestCost = 19;
    public JreVersion(ServerStatus ss) {
        super(ss);
    }

    @Override
    public String getStatusDesc(){
        return super.getStatusDesc() + ", and the JRE version is " + Runtime.version();
    }

    @Override
    public Integer getRequestCost(){
        return super.getRequestCost() + requestCost;
    }
}
