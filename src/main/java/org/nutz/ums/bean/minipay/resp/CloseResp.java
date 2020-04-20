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
public class CloseResp extends BaseResp {

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
     * 链接系统
     */
    private String connectSys;

    public String getConnectSys() {
        return connectSys;
    }

    public void setConnectSys(String connectSys) {
        this.connectSys = connectSys;
    }
}
