package org.nutz.ums.bean.bills.req;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetPayurlReq extends GetQrcodeReq {

    public GetPayurlReq() {
        this.setInstMid("QRPAYDEFAULT");
    }
}
