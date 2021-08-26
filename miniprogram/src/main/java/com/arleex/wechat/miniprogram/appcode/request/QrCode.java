package com.arleex.wechat.miniprogram.appcode.request;


/**
 * @author cat
 */
public class QrCode {

    private String path;
    private Integer width = 430;

    public QrCode(String path, Integer width) {
        this.path = path;
        this.width = width;
    }
}
