package org.nutz.ums.bean;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class Comm {

//    public static String TOKEN_ACCESS_ACTION = "http://58.247.0.18:29015/v1/token/access";
//    public static String NETPAY_BILLS_GETQRCODE_ACTION = "http://58.247.0.18:29015/v1/netpay/bills/get-qrcode";
//    public static String NETPAY_BILLS_UPDATEQRCODE_ACTION = "http://58.247.0.18:29015/v1/netpay/bills/update-qrcode";
//    public static String NETPAY_BILLS_CLOSEQRCODE_ACTION = "http://58.247.0.18:29015/v1/netpay/bills/close-qrcode";
//    public static String NETPAY_BILLS_QUERY_ACTION = "http://58.247.0.18:29015/v1/netpay/bills/query";
//    public static String NETPAY_BILLS_REFUND_ACTION = "http://58.247.0.18:29015/v1/netpay/bills/refund";
//    public static String NETPAY_WX_UNIFIEDORDER_ACTION = "http://58.247.0.18:29015/v1/netpay/wx/unified-order";
//    public static String NETPAY_TRADE_CREATE_ACTION = "http://58.247.0.18:29015/v1/netpay/trade/create";
//    public static String NETPAY_ACP_JSPAY_ACTION = "http://58.247.0.18:29015/v1/netpay/acp/js-pay";
//    public static String NETPAY_WEBPAY_PAY_ACTION = "http://58.247.0.18:29015/v1/netpay/webpay/pay";
//    public static String NETPAY_QUERY_ACTION = "http://58.247.0.18:29015/v1/netpay/query";
//    public static String NETPAY_REFUND_ACTION = "http://58.247.0.18:29015/v1/netpay/refund";
//    public static String NETPAY_REFUNDQUERY_ACTION = "http://58.247.0.18:29015/v1/netpay/refund-query";
//    public static String NETPAY_CLOSE_ACTION = "http://58.247.0.18:29015/v1/netpay/close";

    public static final String TOKEN_ACCESS_ACTION = "https://api-mop.chinaums.com/v1/token/access";
    public static final String NETPAY_BILLS_GETQRCODE_ACTION = "https://api-mop.chinaums.com/v1/netpay/bills/get-qrcode";
    public static final String NETPAY_BILLS_UPDATEQRCODE_ACTION = "https://api-mop.chinaums.com/v1/netpay/bills/update-qrcode";
    public static final String NETPAY_BILLS_CLOSEQRCODE_ACTION = "https://api-mop.chinaums.com/v1/netpay/bills/close-qrcode";
    public static final String NETPAY_BILLS_QUERY_ACTION = "https://api-mop.chinaums.com/v1/netpay/bills/query";
    public static final String NETPAY_BILLS_REFUND_ACTION = "https://api-mop.chinaums.com/v1/netpay/bills/refund";
    public static final String NETPAY_WX_UNIFIEDORDER_ACTION = "https://api-mop.chinaums.com/v1/netpay/wx/unified-order";
    public static final String NETPAY_TRADE_CREATE_ACTION = "https://api-mop.chinaums.com/v1/netpay/trade/create";
    public static final String NETPAY_ACP_JSPAY_ACTION = "https://api-mop.chinaums.com/v1/netpay/acp/js-pay";
    public static final String NETPAY_WEBPAY_PAY_ACTION = "https://api-mop.chinaums.com/v1/netpay/webpay/pay";
    public static final String NETPAY_QUERY_ACTION = "https://api-mop.chinaums.com/v1/netpay/query";
    public static final String NETPAY_REFUND_ACTION = "https://api-mop.chinaums.com/v1/netpay/refund";
    public static final String NETPAY_REFUNDQUERY_ACTION = "https://api-mop.chinaums.com/v1/netpay/refund-query";
    public static final String NETPAY_CLOSE_ACTION = "https://api-mop.chinaums.com/v1/netpay/close";

    public static final String SIGN_METHOD_SHA256 = "SHA256";
    public static final String DATE_FORMART_FULL = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_CHINA_TIMEZONE = "GMT+8";

    /**
     * 证件类型，
     * 微信支持身份证、支付宝支持
     * 身份证：IDENTITY_CARD
     * 护照：PASSPORT
     * 军官证：OFFICER_CARD
     * 士兵证：SOLDIER_CARD
     * 户口本：HOKOU
     */
    public static final String CERTTYPE_IDENTITY_CARD = "IDENTITY_CARD";
    public static final String CERTTYPE_PASSPORT = "PASSPORT";
    public static final String CERTTYPE_OFFICER_CARD = "OFFICER_CARD";
    public static final String CERTTYPE_SOLDIER_CARD = "SOLDIER_CARD";
    public static final String CERTTYPE_HOKOU = "HOKOU";
}