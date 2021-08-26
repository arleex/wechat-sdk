package com.arleex.wechat.miniprogram.appcode.request;

import com.arleex.wechat.miniprogram.appcode.AppCodeRequest;

/**
 * @author cat
 */
public class QrCode implements AppCodeRequest {

    private String path;
    private Integer width = 430;

    public QrCode(String path, Integer width) {
        this.path = path;
        this.width = width;
    }
}
