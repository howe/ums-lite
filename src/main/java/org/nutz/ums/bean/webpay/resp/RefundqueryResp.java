package org.nutz.ums.bean.webpay.resp;

import org.nutz.json.JsonField;
import org.nutz.ums.bean.BaseResp;
import org.nutz.ums.bean.Comm;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundqueryResp extends BaseResp {

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
     * 清分ID
     */
    private String settleRefId;

    public String getSettleRefId() {
        return settleRefId;
    }

    public void setSettleRefId(String settleRefId) {
        this.settleRefId = settleRefId;
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
     * 银行卡号
     */
    private String bankCardNo;

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 银行信息
     */
    private String bankInfo;

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
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

    /**
     * 退款状态
     */
    private String refundStatus;

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 支付时间
     */
    @JsonField(dataFormat = Comm.DATE_FORMART_FULL, timeZone = Comm.DATE_CHINA_TIMEZONE)
    private Date payTime;

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 结算日期
     */
    private String settleDate;

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }
}
