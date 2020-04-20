package org.nutz.ums.bean.bills.resp;

import org.nutz.ums.bean.BaseResp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class CloseQrcodeResp extends BaseResp {

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
     * 系统ID，原样返回
     */
    private String systemId;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
