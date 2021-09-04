package com.arleex.wechat.miniprogram.base;

/**
 * @author cat
 */
public interface BaseService {

    /**
     * @param url
     * @param data
     * @return
     */
    public String httpPost(String url,String data);
}
