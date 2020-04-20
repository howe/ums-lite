package org.nutz.ums.bean;

import org.nutz.json.JsonField;
import org.nutz.lang.Times;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseReq {

    /**
     * 授权令牌
     */
    @JsonField(ignore = true)
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 消息ID
     */
    private String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * 报文请求时间
     * 格式yyyy-MM-dd HH:mm:ss
     */
    private String requestTimestamp = Times.getNowSDT();

    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(String requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }

    /**
     * 请求系统预留字段
     */
    private String srcReserve;

    public String getSrcReserve() {
        return srcReserve;
    }

    public void setSrcReserve(String srcReserve) {
        this.srcReserve = srcReserve;
    }

    /**
     * 商户号
     */
    private String mid;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 终端号
     */
    private String tid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 业务类型
     */
    private String instMid;

    public String getInstMid() {
        return instMid;
    }

    public void setInstMid(String instMid) {
        this.instMid = instMid;
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

    public BaseReq() {
    }
}
