package com.arleex.wechat.miniprogram.api.appcode.request;


/**
 * @author cat
 */
public class QrCodeRequest {

    private String path;

    private Integer width = 430;

    public QrCodeRequest(String path, Integer width) {
        this.path = path;
        this.width = width;
    }
}
