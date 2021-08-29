package com.arleex.wechat.miniprogram.api.urlscheme;

/**
 * @author cat
 */
public interface UrlSchemeService {

    /**
     * 获取小程序 scheme 码，适用于短信、邮件、外部网页、微信内等拉起小程序的业务场景。通过该接口，可以选择生成到期失效和永久有效的小程序码，有数量限制，目前仅针对国内非个人主体的小程序开放
     */
    public void generate();
}
