package com.arleex.wechat.miniprogram;


import com.arleex.wechat.miniprogram.api.appcode.AppCodeServiceImpl;
import com.arleex.wechat.miniprogram.api.urlscheme.UrlSchemeServiceImpl;

/**
 * @author cat
 */
public class Application {

    protected AppCodeServiceImpl appCode;

    protected UrlSchemeServiceImpl urlScheme;

    private static final String baseUrl = "https://qyapi.weixin.qq.com/";


}
