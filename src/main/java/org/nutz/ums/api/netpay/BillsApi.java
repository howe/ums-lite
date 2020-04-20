package org.nutz.ums.api.netpay;

import org.nutz.http.Header;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.qrcode.QRCode;
import org.nutz.ums.bean.Comm;
import org.nutz.ums.bean.bills.req.*;
import org.nutz.ums.bean.bills.resp.*;
import org.nutz.ums.util.HttpUtil;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class BillsApi {

    /**
     * 二维码获取
     *
     * @param req
     * @return
     */
    public static GetQrcodeResp getQrcode(GetQrcodeReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Lang.isEmpty(req.getTotalAmount())) {
                throw new NullPointerException("totalAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                GetQrcodeResp resp = Json.fromJson(GetQrcodeResp.class, HttpUtil.post(Comm.NETPAY_BILLS_GETQRCODE_ACTION, header, Json.toJson(req, JsonFormat.compact())));
                if (Strings.equalsIgnoreCase(resp.getErrCode(), "SUCCESS")) {
                    return resp;
                } else {
                    throw new Exception(resp.getErrMsg());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 二维码获取接口解析成支付跳转链接
     *
     * @param req
     * @return
     */
    public static String getPayurl(GetQrcodeReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Lang.isEmpty(req.getTotalAmount())) {
                throw new NullPointerException("totalAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                GetQrcodeResp resp = Json.fromJson(GetQrcodeResp.class, HttpUtil.post(Comm.NETPAY_BILLS_GETQRCODE_ACTION, header, Json.toJson(req, JsonFormat.compact())));
                if (Strings.equalsIgnoreCase(resp.getErrCode(), "SUCCESS")) {
                    return QRCode.from(resp.getBillQRCode());
                } else {
                    throw new Exception(resp.getErrMsg());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 二维码更新
     *
     * @param req
     * @return
     */
    public static UpdateQrcodeResp updateQrcode(UpdateQrcodeReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Lang.isEmpty(req.getTotalAmount())) {
                throw new NullPointerException("totalAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                UpdateQrcodeResp resp = Json.fromJson(UpdateQrcodeResp.class, HttpUtil.post(Comm.NETPAY_BILLS_UPDATEQRCODE_ACTION, header, Json.toJson(req, JsonFormat.compact())));
                if (Strings.equalsIgnoreCase(resp.getErrCode(), "SUCCESS")) {
                    return resp;
                } else {
                    throw new Exception(resp.getErrMsg());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 二维码关闭
     *
     * @param req
     * @return
     */
    public static CloseQrcodeResp closeQrcode(CloseQrcodeReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Strings.isBlank(req.getQrCodeId())) {
                throw new NullPointerException("totalAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                CloseQrcodeResp resp = Json.fromJson(CloseQrcodeResp.class, HttpUtil.post(Comm.NETPAY_BILLS_CLOSEQRCODE_ACTION, header, Json.toJson(req, JsonFormat.compact())));
                if (Strings.equalsIgnoreCase(resp.getErrCode(), "SUCCESS")) {
                    return resp;
                } else {
                    throw new Exception(resp.getErrMsg());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 账单状态查询
     *
     * @param req
     * @return
     */
    public static QueryResp query(QueryReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Strings.isBlank(req.getBillNo())) {
                throw new NullPointerException("billNo为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                QueryResp resp = Json.fromJson(QueryResp.class, HttpUtil.post(Comm.NETPAY_BILLS_QUERY_ACTION, header, Json.toJson(req, JsonFormat.compact())));
                if (Strings.equalsIgnoreCase(resp.getErrCode(), "SUCCESS")) {
                    return resp;
                } else {
                    throw new Exception(resp.getErrMsg());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }

    /**
     * 退款
     *
     * @param req
     * @return
     */
    public static RefundResp refund(RefundReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Strings.isBlank(req.getBillNo())) {
                throw new NullPointerException("billNo为空");
            } else if (Strings.isBlank(req.getRefundOrderId())) {
                throw new NullPointerException("refundOrderId为空");
            } else if (Lang.isEmpty(req.getRefundAmount())) {
                throw new NullPointerException("refundAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                RefundResp resp = Json.fromJson(RefundResp.class, HttpUtil.post(Comm.NETPAY_BILLS_REFUND_ACTION, header, Json.toJson(req, JsonFormat.compact())));
                if (Strings.equalsIgnoreCase(resp.getErrCode(), "SUCCESS")) {
                    return resp;
                } else {
                    throw new Exception(resp.getErrMsg());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
