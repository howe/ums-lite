package org.nutz.ums.api.netpay;

import org.nutz.http.Header;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.ums.bean.Comm;
import org.nutz.ums.bean.minipay.req.*;
import org.nutz.ums.bean.minipay.resp.*;
import org.nutz.ums.util.HttpUtil;
import org.nutz.ums.util.Util;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class MinipayApi {


    /**
     * 支付宝下单
     *
     * @param req
     * @return
     */
    public static CreateResp create(CreateReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Lang.isEmpty(req.getTotalAmount())) {
                throw new NullPointerException("totalAmount为空");
            } else if (Strings.isBlank(req.getMerOrderId())) {
                throw new NullPointerException("merOrderId为空");
            } else if (Strings.isBlank(req.getUserId())) {
                throw new NullPointerException("userId为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                CreateResp resp = Json.fromJson(CreateResp.class, HttpUtil.post(Comm.NETPAY_TRADE_CREATE_ACTION, header, Json.toJson(req, JsonFormat.compact())));
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
     * 微信下单
     *
     * @param req
     * @return
     */
    public static UnifiedorderResp unifiedorder(UnifiedorderReq req) {

        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Lang.isEmpty(req.getTotalAmount())) {
                throw new NullPointerException("totalAmount为空");
            } else if (Strings.isBlank(req.getMerOrderId())) {
                throw new NullPointerException("merOrderId为空");
            } else if (Strings.isBlank(req.getSubAppId())) {
                throw new NullPointerException("subAppId为空");
            } else if (Strings.isBlank(req.getSubOpenId())) {
                throw new NullPointerException("subOpenId为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                UnifiedorderResp resp = Json.fromJson(UnifiedorderResp.class, HttpUtil.post(Comm.NETPAY_WX_UNIFIEDORDER_ACTION, header, Json.toJson(req, JsonFormat.compact())));
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
     * 订单交易查询
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
            } else if (Util.isAllBlank(req.getMerOrderId(), req.getTargetOrderId())) {
                throw new NullPointerException("merOrderId与targetOrderId不能全为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                QueryResp resp = Json.fromJson(QueryResp.class, HttpUtil.post(Comm.NETPAY_QUERY_ACTION, header, Json.toJson(req, JsonFormat.compact())));
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
            } else if (Strings.isBlank(req.getMerOrderId())) {
                throw new NullPointerException("merOrderId为空");
            } else if (Strings.isBlank(req.getRefundOrderId())) {
                throw new NullPointerException("refundOrderId为空");
            } else if (Strings.isBlank(req.getTargetOrderId())) {
                throw new NullPointerException("targetOrderId为空");
            } else if (Lang.isEmpty(req.getRefundAmount())) {
                throw new NullPointerException("refundAmount为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                RefundResp resp = Json.fromJson(RefundResp.class, HttpUtil.post(Comm.NETPAY_REFUND_ACTION, header, Json.toJson(req, JsonFormat.compact())));
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
     * 退款查询
     *
     * @param req
     * @return
     */
    public static RefundqueryResp refundquery(RefundqueryReq req) {
        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Strings.isBlank(req.getMerOrderId())) {
                throw new NullPointerException("merOrderId为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                RefundqueryResp resp = Json.fromJson(RefundqueryResp.class, HttpUtil.post(Comm.NETPAY_REFUNDQUERY_ACTION, header, Json.toJson(req, JsonFormat.compact())));
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
     * 订单关闭
     *
     * @param req
     * @return
     */
    public static CloseResp close(CloseReq req) {
        try {
            if (Strings.isBlank(req.getAccessToken())) {
                throw new NullPointerException("accessToken为空");
            } else if (Strings.isBlank(req.getMid())) {
                throw new NullPointerException("mid为空");
            } else if (Strings.isBlank(req.getTid())) {
                throw new NullPointerException("tid为空");
            } else if (Strings.isBlank(req.getMerOrderId())) {
                throw new NullPointerException("merOrderId为空");
            } else {
                Header header = Header.create();
                header.set("OPEN-ACCESS-TOKEN AccessToken", req.getAccessToken());
                CloseResp resp = Json.fromJson(CloseResp.class, HttpUtil.post(Comm.NETPAY_CLOSE_ACTION, header, Json.toJson(req, JsonFormat.compact())));
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
