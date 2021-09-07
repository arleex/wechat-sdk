package com.arleex.wechat.miniprogram.base;

import com.arleex.wechat.miniprogram.common.httpclient.HttpClient;

import javax.annotation.Resource;

/**
 * @author cat
 */
public abstract class BaseServiceImpl{

    @Resource
    public HttpClient httpClient;

    public String httpPost(String url, String data){
        return httpClient.httpPost(url,data);
    }


}
