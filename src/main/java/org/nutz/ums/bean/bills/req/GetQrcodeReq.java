package org.nutz.ums.bean.bills.req;

import org.nutz.ums.bean.BaseReq;
import org.nutz.ums.bean.biz.Goods;
import org.nutz.ums.bean.biz.SubOrder;
import org.nutz.ums.util.Util;

import java.util.List;

/**
 * 二维码获取
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class GetQrcodeReq extends BaseReq {

    /**
     * 账单号
     */
    private String billNo;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    /**
     * 账单日期
     */
    private String billDate;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * 账单日期
     */
    private String billDesc;

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
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
     * 分账标记
     * 默认值为false
     * 暂时只支持微信（WXPay.jsPay）和支付宝（trade.jsPay）支付。
     * 若为true，则goods字段和subOrders字段不能同时为空，且secureTransaction字段上送false或不上送。
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
     * 若分账标记传，则分账金额必传
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
     * 会员号
     */
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * 桌号、柜台号、房间号
     */
    private String counterNo;

    public String getCounterNo() {
        return counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }

    /**
     * 账单过期时间
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
     * 网页跳转地址
     */
    private String returnUrl;

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * 二维码ID
     * 针对需要自行生成二维码的情况
     * {来源编号(4位)}{时间(yyyyMMddmmHHssSSS)(17位)}{7位随机数}
     */
    private String qrCodeId;

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
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
     * 钱包选项
     * 说明：单一钱包支付传SINGLE, 多钱包支付传MULTIPLE
     */
    private String walletOption;

    public String getWalletOption() {
        return walletOption;
    }

    public void setWalletOption(String walletOption) {
        this.walletOption = walletOption;
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
     * 实名认证证件类型
     * <p>
     * 证件类型，
     * 微信支持身份证
     *
     * 支付宝支持
     * 身份证：IDENTITY_CARD
     * 护照：PASSPORT
     * 军官证：OFFICER_CARD
     * 士兵证：SOLDIER_CARD
     * 户口本：HOKOU
     */
    private String certType;

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
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
     * 支付要素查询地址
     * 去商户那里查询支付要素的接口地址，见第9节 固定二维码支付要素查询接口规范。
     * 提醒：一次性码支付不用上送
     */
    private String payInfoQueryAddr;

    public String getPayInfoQueryAddr() {
        return payInfoQueryAddr;
    }

    public void setPayInfoQueryAddr(String payInfoQueryAddr) {
        this.payInfoQueryAddr = payInfoQueryAddr;
    }

    /**
     * 预授权交易标识
     * 取值：true或false，默认false(目前仅有一次性银联聚合码支持该业务)
     * 若上送为true，则交易的金额将会被银行冻结。
     * 调用预授权完成接口后，完成部分金额会在t+1日结算给商户，剩余部分金额在用户银行卡中解冻。
     * 调用预授权撤销接口，则用户资金在银行解冻。30天后没有主动调用预授权完成且没有主动调用预授权撤销的交易，将会自动解冻。
     */
    private Boolean preauthTransaction;

    public Boolean getPreauthTransaction() {
        return preauthTransaction;
    }

    public void setPreauthTransaction(Boolean preauthTransaction) {
        this.preauthTransaction = preauthTransaction;
    }

    /**
     * 花呗分期数
     * 仅支持支付宝
     * 值为3、6、12
     */
    private Integer installmentNumber;

    public Integer getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(Integer installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public GetQrcodeReq() {
        this.setInstMid("QRPAYDEFAULT");
    }
}
