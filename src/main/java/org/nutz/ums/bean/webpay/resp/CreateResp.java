package org.nutz.ums.bean.webpay.resp;

import org.nutz.lang.util.NutMap;
import org.nutz.ums.bean.BaseResp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class CreateResp extends BaseResp {

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
     * 支付总金额
     *
     */
    private Long totalAmount;

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 第三方订单号
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
     * 目标平台的状态
     */
    private String targetStatus;

    public String getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * JSAPI支付用的请求报文，带有签名信息
     */
    private NutMap jsPayRequest;

    public NutMap getJsPayRequest() {
        return jsPayRequest;
    }

    public void setJsPayRequest(NutMap jsPayRequest) {
        this.jsPayRequest = jsPayRequest;
    }

    /**
     * 支付渠道商户号，各渠道情况不同，酌情转换
     */
    private String targetMid;

    public String getTargetMid() {
        return targetMid;
    }

    public void setTargetMid(String targetMid) {
        this.targetMid = targetMid;
    }
}
