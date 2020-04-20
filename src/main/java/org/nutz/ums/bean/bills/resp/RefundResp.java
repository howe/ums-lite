package org.nutz.ums.bean.bills.resp;

import org.nutz.json.JsonField;
import org.nutz.ums.bean.BaseResp;
import org.nutz.ums.bean.Comm;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class RefundResp extends BaseResp {

    /**
     * 账单号，原样返回
     */
    private String billNo;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 账单日期，原样返回
     */
    private String billDate;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * 账单状态
     */
    private String billStatus;

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * 账单二维码
     */
    private String billQRCode;

    public String getBillQRCode() {
        return billQRCode;
    }

    public void setBillQRCode(String billQRCode) {
        this.billQRCode = billQRCode;
    }

    /**
     * 原订单商户订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
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
     * 退款时间
     */
    @JsonField(dataFormat = Comm.DATE_FORMART_FULL, timeZone = Comm.DATE_CHINA_TIMEZONE)
    private Date refundPayTime;

    public Date getRefundPayTime() {
        return refundPayTime;
    }

    public void setRefundPayTime(Date refundPayTime) {
        this.refundPayTime = refundPayTime;
    }

    /**
     * 退款结果
     * SUCCESS 成功
     * FAIL 失败
     * PROCESSING 处理中
     * UNKNOWN 异常
     */
    private String refundStatus;

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 借贷记标识
     * DEBIT_CARD（借记卡）
     * CREDIT_CARD（贷记卡）
     */
    private String cardAttr;

    public String getCardAttr() {
        return cardAttr;
    }

    public void setCardAttr(String cardAttr) {
        this.cardAttr = cardAttr;
    }

    /**
     * 退款金额
     */
    private Long refundAmount;

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 买家实退金额
     */
    private Long refundInvoiceAmount;

    public Long getRefundInvoiceAmount() {
        return refundInvoiceAmount;
    }

    public void setRefundInvoiceAmount(Long refundInvoiceAmount) {
        this.refundInvoiceAmount = refundInvoiceAmount;
    }
}
