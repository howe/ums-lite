package org.nutz.ums.bean.bills.resp;

import org.nutz.json.JsonField;
import org.nutz.ums.bean.BaseResp;
import org.nutz.ums.bean.Comm;
import org.nutz.ums.bean.biz.AuthedBillPayment;
import org.nutz.ums.bean.biz.BillPayment;
import org.nutz.ums.bean.biz.RefundBillPayment;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class QueryResp extends BaseResp {

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
     * 账单创建时间
     */
    @JsonField(dataFormat = Comm.DATE_FORMART_FULL, timeZone = Comm.DATE_CHINA_TIMEZONE)
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 账单描述
     */
    private String billDesc;

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
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
     * 会员号
     */
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * 桌号
     */
    private String counterNo;

    public String getCounterNo() {
        return counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
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
     * 付款附言
     */
    private String memo;

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 担保状态
     */
    private String secureStatus;

    public String getSecureStatus() {
        return secureStatus;
    }

    public void setSecureStatus(String secureStatus) {
        this.secureStatus = secureStatus;
    }

    /**
     * 担保完成金额（分）
     */
    private Long completeAmount;

    public Long getCompleteAmount() {
        return completeAmount;
    }

    public void setCompleteAmount(Long completeAmount) {
        this.completeAmount = completeAmount;
    }

    /**
     * 账单支付信息
     */
    private BillPayment billPayment;

    public BillPayment getBillPayment() {
        return billPayment;
    }

    public void setBillPayment(BillPayment billPayment) {
        this.billPayment = billPayment;
    }

    /**
     * 账单退款信息
     */
    private RefundBillPayment refundBillPayment;

    public RefundBillPayment getRefundBillPayment() {
        return refundBillPayment;
    }

    public void setRefundBillPayment(RefundBillPayment refundBillPayment) {
        this.refundBillPayment = refundBillPayment;
    }

    /**
     * 预授权账单信息
     */
    private AuthedBillPayment authedBillPayment;

    public AuthedBillPayment getAuthedBillPayment() {
        return authedBillPayment;
    }

    public void setAuthedBillPayment(AuthedBillPayment authedBillPayment) {
        this.authedBillPayment = authedBillPayment;
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
     * 花呗分期数
     * 仅支持支付宝
     * 值为3、6、12
     */
    private Integer installmentNumber;

    public Integer getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(Integer installmentNumber) {
        this.installmentNumber = installmentNumber;
    }
}
