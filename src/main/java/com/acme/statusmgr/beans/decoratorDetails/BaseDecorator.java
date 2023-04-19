package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerStatus;

public abstract class BaseDecorator extends ServerStatus {
    ServerStatus ss;

    public BaseDecorator(ServerStatus ss){this.ss = ss;}
}
