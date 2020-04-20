package org.nutz.ums.bean.token.resp;

/**
 * AccessToken获取
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class AccessResp {

    /**
     * 错误代码
     */
    private String errCode;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * 错误说明
     */
    private String errInfo;

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }

    /**
     * 授权令牌
     */
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 失效时间
     */
    private Long expiresIn;

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "AccessResp{" +
                "errCode='" + errCode + '\'' +
                ", errInfo='" + errInfo + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
