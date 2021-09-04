package com.arleex.wechat.miniprogram.base;

import com.arleex.wechat.miniprogram.common.httpclient.HttpClient;

import javax.annotation.Resource;

/**
 * @author cat
 */
public abstract class BaseServiceImpl implements BaseService{

    @Resource
    public HttpClient httpClient;

    @Override
    public String httpPost(String url, String data){
        return httpClient.httpPost(url,data);
    }
}
