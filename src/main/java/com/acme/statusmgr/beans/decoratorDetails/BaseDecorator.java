package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.ServerStatus;
import com.acme.statusmgr.beans.controller;

public abstract class BaseDecorator implements ServerInterface {
    ServerInterface ss;

    public BaseDecorator(ServerInterface ss){this.ss = ss;}

//    @Override
//    public String getStatusDesc() {
//        return ss.getStatusDesc();
//    }
//
//    @Override
//    public long getid(){
//        return ss.getId();
//    }
//    public String getContentHeader(){
//
//    }
//
//    public Integer getRequestCost(){
//
//    }

}
