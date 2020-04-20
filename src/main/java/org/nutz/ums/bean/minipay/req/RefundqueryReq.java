package org.nutz.ums.bean.minipay.req;

import org.nutz.ums.bean.BaseReq;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundqueryReq extends BaseReq {

    public RefundqueryReq() {
        this.setInstMid("MINIDEFAULT");
    }

    /**
     * 商户订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }
}
