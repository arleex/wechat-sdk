package com.arleex.wechat.miniprogram.common.httpclient;

/**
 *
 * @author cat
 */
public interface HttpClient {

    /**
     * @param url
     * @param data
     * @return
     */
    public String httpPost(String url,String data);
}
