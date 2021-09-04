package com.arleex.wechat.miniprogram.common.httpclient.strategy;

import java.io.IOException;

/**
 * @author cat
 */
public interface HttpClientStrategy {
    /**
     * @return
     */
    String type();

    /**
     * @param url
     * @param data
     * @return
     */
    public String httpPost(String url,String data) throws IOException;
}
