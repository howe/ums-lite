package org.nutz.ums.api.token;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.ums.bean.Comm;
import org.nutz.ums.bean.token.req.AccessReq;
import org.nutz.ums.bean.token.resp.AccessResp;
import org.nutz.ums.util.HttpUtil;

/**
 * Copyright 2018 Freshplay Co ltd
 *
 * @author howechiang
 */
public class TokenApi {

    /**
     * AccessToken获取
     *
     * @param req
     * @return
     */
    public static AccessResp access(AccessReq req) {

        try {
            if (Strings.isBlank(req.getAppId())) {
                throw new NullPointerException("appId为空");
            } else if (Strings.isBlank(req.getNonce())) {
                throw new NullPointerException("nonce为空");
            } else if (Strings.isBlank(req.getTimestamp())) {
                throw new NullPointerException("timestamp为空");
            } else if (Strings.isBlank(req.getSignature())) {
                throw new NullPointerException("signature为空");
            } else {
                AccessResp resp = Json.fromJson(AccessResp.class, HttpUtil.post(Comm.TOKEN_ACCESS_ACTION, Json.toJson(req, JsonFormat.compact())));
                if (Strings.isNotBlank(resp.getAccessToken())) {
                    return resp;
                } else {
                    throw new Exception(resp.getErrInfo());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw Lang.wrapThrow(e);
        }
    }
}
