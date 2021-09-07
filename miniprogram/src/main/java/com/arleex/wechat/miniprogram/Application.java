package com.arleex.wechat.miniprogram;


import com.arleex.wechat.miniprogram.api.appcode.AppCodeService;
import com.arleex.wechat.miniprogram.api.urlscheme.UrlSchemeService;

import javax.annotation.Resource;

/**
 * @author cat
 */
public class Application {

    @Resource
    protected AppCodeService appCode;

    @Resource
    protected UrlSchemeService urlScheme;


    public AppCodeService appCode()
    {
        return appCode;
    }
}
