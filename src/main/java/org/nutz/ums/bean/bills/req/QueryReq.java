package org.nutz.ums.bean.bills.req;

import org.nutz.ums.bean.BaseReq;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryReq extends BaseReq {

    /**
     * 账单号
     */
    private String billNo;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 退款订单号
     */
    private String refundOrderId;

    public String getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
    }

    /**
     * 预授权完成订单号
     */
    private String authedOrderId;

    public String getAuthedOrderId() {
        return authedOrderId;
    }

    public void setAuthedOrderId(String authedOrderId) {
        this.authedOrderId = authedOrderId;
    }

    /**
     * 账单日期
     */
    private String billDate;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public QueryReq() {
        this.setInstMid("QRPAYDEFAULT");
    }
}