package org.nutz.ums.bean.minipay.resp;

import org.nutz.json.JsonField;
import org.nutz.ums.bean.BaseResp;
import org.nutz.ums.bean.Comm;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryResp extends BaseResp {

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
     * 检索参考号
     */
    private String refId;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
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
     * 买家ID
     */
    private String buyerId;

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
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
     * 支付渠道列表
     * 格式为：方式:金额（单位：分）|方式:金额|……
     */
    private String billFunds;

    public String getBillFunds() {
        return billFunds;
    }

    public void setBillFunds(String billFunds) {
        this.billFunds = billFunds;
    }

    /**
     * 支付渠道描述
     */
    private String billFundsDesc;

    public String getBillFundsDesc() {
        return billFundsDesc;
    }

    public void setBillFundsDesc(String billFundsDesc) {
        this.billFundsDesc = billFundsDesc;
    }

    /**
     * 支付宝买家付款的金额
     */
    private Long buyerPayAmount;

    public Long getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(Long buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    /**
     * 买家用户名
     */
    private String buyerUsername;

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    /**
     * 网付计算的优惠金额
     */
    private Long couponAmount;

    public Long getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 交易中可给用户开具发票的金额
     */
    private Long invoiceAmount;

    public Long getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 商户实收金额
     */
    private Long receiptAmount;

    public Long getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Long receiptAmount) {
        this.receiptAmount = receiptAmount;
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

    /**
     * 子买家ID
     */
    private String subBuyerId;

    public String getSubBuyerId() {
        return subBuyerId;
    }

    public void setSubBuyerId(String subBuyerId) {
        this.subBuyerId = subBuyerId;
    }

    /**
     * 微信活动ID
     */
    private String activityIds;

    public String getActivityIds() {
        return activityIds;
    }

    public void setActivityIds(String activityIds) {
        this.activityIds = activityIds;
    }

    /**
     * 营销联盟优惠金额
     */
    private Long yxlmAmount;

    public Long getYxlmAmount() {
        return yxlmAmount;
    }

    public void setYxlmAmount(Long yxlmAmount) {
        this.yxlmAmount = yxlmAmount;
    }
}
