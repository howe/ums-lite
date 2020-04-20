package org.nutz.ums.bean.biz;

import org.nutz.json.JsonField;
import org.nutz.ums.bean.Comm;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundBillPayment {

    /**
     * 商户退款单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    /**
     * 账单业务类型
     */
    private String billBizType;

    public String getBillBizType() {
        return billBizType;
    }

    public void setBillBizType(String billBizType) {
        this.billBizType = billBizType;
    }

    /**
     * 交易参考号
     */
    private String paySeqId;

    public String getPaySeqId() {
        return paySeqId;
    }

    public void setPaySeqId(String paySeqId) {
        this.paySeqId = paySeqId;
    }

    /**
     * 账单流水总金额
     */
    private Long totalAmount;

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 实付金额
     */
    private Long buyerPayAmount;

    public Long getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(Long buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    /**
     * 开票金额
     */
    private Long invoiceAmount;

    public Long getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 折扣金额
     */
    private Long discountAmount;

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
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
     * 支付详情
     */
    private String payDetail;

    public String getPayDetail() {
        return payDetail;
    }

    public void setPayDetail(String payDetail) {
        this.payDetail = payDetail;
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
     * 结算时间
     */
    private String settleDate;

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
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
     * 目标系统
     */
    private String targetSys;

    public String getTargetSys() {
        return targetSys;
    }

    public void setTargetSys(String targetSys) {
        this.targetSys = targetSys;
    }
}
