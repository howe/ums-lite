package org.nutz.ums.bean.webpay.resp;

import org.nutz.ums.bean.BaseResp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundResp extends BaseResp {

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
     * 平台流水号
     */
    private String seqId;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    /**
     * 交易状态
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 商户名称
     */
    private String merName;

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    /**
     * 支付渠道商户号
     */
    private String targetMid;

    public String getTargetMid() {
        return targetMid;
    }

    public void setTargetMid(String targetMid) {
        this.targetMid = targetMid;
    }

    /**
     * 目标平台状态
     */
    private String targetStatus;

    public String getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * 目标平台单号
     */
    private String targetOrderId;

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    /**
     * 目标平台代码
     */
    private String targetSys;

    public String getTargetSys() {
        return targetSys;
    }

    public void setTargetSys(String targetSys) {
        this.targetSys = targetSys;
    }

    /**
     * 账单总金额
     */
    private Long totalAmount;

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 总退款金额
     */
    private Long refundAmount;

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 退款渠道列表
     */
    private String refundFunds;

    public String getRefundFunds() {
        return refundFunds;
    }

    public void setRefundFunds(String refundFunds) {
        this.refundFunds = refundFunds;
    }

    /**
     * 退款渠道描述
     */
    private String refundFundsDesc;

    public String getRefundFundsDesc() {
        return refundFundsDesc;
    }

    public void setRefundFundsDesc(String refundFundsDesc) {
        this.refundFundsDesc = refundFundsDesc;
    }

    /**
     * 实付部分退款金额
     */
    private Long refundInvoiceAmount;

    public Long getRefundInvoiceAmount() {
        return refundInvoiceAmount;
    }

    public void setRefundInvoiceAmount(Long refundInvoiceAmount) {
        this.refundInvoiceAmount = refundInvoiceAmount;
    }

    /**
     * 退货订单号
     */
    private String refundOrderId;

    public String getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
    }

    /**
     * 目标系统退货订单号
     */
    private String refundTargetOrderId;

    public String getRefundTargetOrderId() {
        return refundTargetOrderId;
    }

    public void setRefundTargetOrderId(String refundTargetOrderId) {
        this.refundTargetOrderId = refundTargetOrderId;
    }
}
