package org.nutz.ums.bean.minipay.req;

import org.nutz.ums.bean.BaseReq;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryReq extends BaseReq {

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

    /**
     * 支付订单号
     */
    private String targetOrderId;

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    public QueryReq() {
        this.setInstMid("QRPAYDEFAULT");
    }
}