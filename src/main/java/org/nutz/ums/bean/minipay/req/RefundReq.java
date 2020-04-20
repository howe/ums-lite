package org.nutz.ums.bean.minipay.req;

import org.nutz.ums.bean.BaseReq;
import org.nutz.ums.bean.biz.SubOrder;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundReq extends BaseReq {
    public RefundReq() {
        this.setInstMid("YUEDANDEFAULT");
    }

    /**
     * 原交易订单号
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
     * 要退货的金额
     */
    private Long refundAmount;

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 平台商户退款分账金额
     */
    private Long platformAmount;

    public Long getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(Long platformAmount) {
        this.platformAmount = platformAmount;
    }

    /**
     * 子订单信息
     */
    private List<SubOrder> subOrders;

    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
    }

    /**
     * 退货说明
     */
    private String refundDesc;

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }
}
