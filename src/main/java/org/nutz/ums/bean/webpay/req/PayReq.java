package org.nutz.ums.bean.webpay.req;

import org.nutz.json.Json;
import org.nutz.lang.Lang;
import org.nutz.lang.Times;
import org.nutz.lang.random.R;
import org.nutz.ums.bean.biz.Webpaypay;
import org.nutz.ums.util.Util;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class PayReq {

    /**
     * 认证方式
     */
    private String authorization = "OPEN-FORM-PARAM";

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    /**
     * AppId
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
    private String timestamp = Times.format("yyyyMMddHHmmss", Times.now());

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
     * 业务内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 签名
     * Base64_Encode(HmacSHA256(appId + timestamp + nonce + SHA256_HEX(content), AppKey))
     */
    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public PayReq(String appId, Webpaypay pay, String appKey) {
        this.appId = appId;
        String content = Util.replaceBlank(Json.toJson(Util.sorting(Lang.obj2nutmap(pay), "asc")));
        System.out.println(content);
        this.content = content;
        this.signature = Util.replaceBlank(Util.Base64.encode(Lang.hmacSHA256(this.appId + this.timestamp + this.nonce + Lang.sha256(this.content), appKey)));
    }

    public PayReq() {
    }
}
