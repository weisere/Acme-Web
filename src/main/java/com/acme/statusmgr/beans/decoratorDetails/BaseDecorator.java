package com.acme.statusmgr.beans.decoratorDetails;

<<<<<<< HEAD
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

=======
import com.acme.statusmgr.beans.ServerStatus;

public abstract class BaseDecorator extends ServerStatus {
    ServerStatus ss;

    public BaseDecorator(ServerStatus ss){this.ss = ss;}
>>>>>>> 9933481 (This abstract class, BaseDecorator will be the go between the original ServerStatus class and the decorators i will make on top of that class)
}
