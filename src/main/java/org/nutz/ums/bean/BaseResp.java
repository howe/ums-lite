package org.nutz.ums.bean;

import org.nutz.json.JsonField;

import java.util.Date;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BaseResp {

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
    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    /**
     * 消息ID，原样返回
     */
    private String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * 报文应答时间
     */
    @JsonField(dataFormat = Comm.DATE_FORMART_FULL, timeZone = Comm.DATE_CHINA_TIMEZONE)
    private Date responseTimeStamp;

    public Date getResponseTimeStamp() {
        return responseTimeStamp;
    }

    public void setResponseTimeStamp(Date responseTimeStamp) {
        this.responseTimeStamp = responseTimeStamp;
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
     * 商户号，原样返回
     */
    private String mid;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 终端号，原样返回
     */
    private String tid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 业务类型，原样返回
     */
    private String instMid;

    public String getInstMid() {
        return instMid;
    }

    public void setInstMid(String instMid) {
        this.instMid = instMid;
    }
}
