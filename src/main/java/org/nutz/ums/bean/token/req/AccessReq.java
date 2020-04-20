package org.nutz.ums.bean.token.req;

import org.nutz.lang.Lang;
import org.nutz.lang.Times;
import org.nutz.lang.random.R;
import org.nutz.ums.bean.Comm;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class AccessReq {

    /**
     * 产品ID
     */
    private String appId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 时间戳
     * yyyyMMddHHmmss
     */
    private String timestamp = Times.getNowSDT();

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 随机数
     */
    private String nonce = R.UU64();

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * 签名方法
     */
    private String signMethod = Comm.SIGN_METHOD_SHA256;

    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    /**
     * 签名
     * SHA256_hex(appId+timestamp+nonce+appKey)
     */
    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public AccessReq(String appId, String appKey) {
        this.appId = appId;
        this.signature = Lang.sha256(this.appId + this.timestamp + this.nonce + appKey);
    }

    public AccessReq() {
    }

    @Override
    public String toString() {
        return "AccessReq{" +
                "appId='" + appId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", nonce='" + nonce + '\'' +
                ", signMethod='" + signMethod + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
