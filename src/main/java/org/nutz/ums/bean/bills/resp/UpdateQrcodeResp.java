package org.nutz.ums.bean.bills.resp;

import org.nutz.ums.bean.BaseResp;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class UpdateQrcodeResp extends BaseResp {

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
