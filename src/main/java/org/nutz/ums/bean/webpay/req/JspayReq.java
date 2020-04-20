package org.nutz.ums.bean.webpay.req;

import org.nutz.ums.bean.BaseReq;
import org.nutz.ums.bean.biz.Goods;
import org.nutz.ums.bean.biz.SubOrder;
import org.nutz.ums.util.Util;

import java.util.List;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class JspayReq extends BaseReq {
    public JspayReq() {
        this.setInstMid("YUEDANDEFAULT");
    }

    /**
     * 商户订单号
     */
    private String merOrderId;

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    /**
     * 分账标记
     */
    private Boolean divisionFlag;

    public Boolean getDivisionFlag() {
        return divisionFlag;
    }

    public void setDivisionFlag(Boolean divisionFlag) {
        this.divisionFlag = divisionFlag;
    }

    /**
     * 平台商户分账金额
     */
    private Long platformAmount;

    public Long getPlatformAmount() {
        return platformAmount;
    }

    public void setPlatformAmount(Long platformAmount) {
        this.platformAmount = platformAmount;
    }

    /**
     * 商品信息
     */
    private List<Goods> goods;

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    /**
     * 子订单信息
     */
    private List<SubOrder> subOrders;

    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
    }

    /**
     * 商户附加数据
     */
    private String attachedData;

    public String getAttachedData() {
        return attachedData;
    }

    public void setAttachedData(String attachedData) {
        this.attachedData = attachedData;
    }

    /**
     * 账单描述
     */
    private String orderDesc;

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * 商品标记
     */
    private String goodsTag;

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    /**
     * 订单原始金额
     */
    private Long originalAmount;

    public Long getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Long originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * 订单过期时间
     * 为空则不过期，格式yyyy-MM-dd HH:mm:ss
     * 一次性二维码的默认过期时间为30分钟，
     * 固定码无期限（获取的二维码若显示在自助机上等类似业务，该字段为必传）
     */
    private String expireTime;

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 支付总金额
     * 单位 分
     */
    private Long totalAmount;

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 支付结果通知地址
     */
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 订单展示页面
     */
    private String showUrl;

    public String getShowUrl() {
        return showUrl;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    /**
     * 实名认证姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Util.Base64.encode(name);
    }

    /**
     * 实名认证手机号
     */
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = Util.Base64.encode(mobile);
    }

    /**
     * 实名认证证件号
     */
    private String certNo;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = Util.Base64.encode(certNo);
    }

    /**
     * 是否需要实名认证
     * 需要实名认证时置为T
     */
    private String fixBuyer;

    public String getFixBuyer() {
        return fixBuyer;
    }

    public void setFixBuyer(String fixBuyer) {
        this.fixBuyer = fixBuyer;
    }

    /**
     * 是否需要限制信用卡支付
     * 取值：true或false，默认false
     */
    private Boolean limitCreditCard;

    public Boolean getLimitCreditCard() {
        return limitCreditCard;
    }

    public void setLimitCreditCard(Boolean limitCreditCard) {
        this.limitCreditCard = limitCreditCard;
    }

    /**
     * 担保交易标识
     * 取值：true或false， 默认false
     * 若上送为true，则交易的金额将会被暂缓结算。
     * 调用担保完成接口后，完成部分金额会在t+1日结算给商户，剩余部分金额退还用户。
     * 调用担保撤销接口，则全部资金退还给用户。
     * 30天后没有主动调用担保完成 且 没有主动调用担保撤销的交易 将会自动按撤销处理。
     */
    private Boolean secureTransaction;

    public Boolean getSecureTransaction() {
        return secureTransaction;
    }

    public void setSecureTransaction(Boolean secureTransaction) {
        this.secureTransaction = secureTransaction;
    }

    /**
     * 交易类型
     */
    private String tradeType = "JSAPI";

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 云闪付用户标识
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取APP用户信息的临时授权码
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
