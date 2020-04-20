package org.nutz.ums.bean.bills.req;

import org.nutz.ums.bean.BaseReq;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class CloseQrcodeReq extends BaseReq {

    /**
     * 二维码ID
     */
    private String qrCodeId;

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

    /**
     * 系统ID
     */
    private String systemId;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * 是否关闭二维码的同时发起退货
     */
    private Boolean attachRefund;

    public Boolean getAttachRefund() {
        return attachRefund;
    }

    public void setAttachRefund(Boolean attachRefund) {
        this.attachRefund = attachRefund;
    }

    public CloseQrcodeReq() {
        this.setInstMid("QRPAYDEFAULT");
    }
}