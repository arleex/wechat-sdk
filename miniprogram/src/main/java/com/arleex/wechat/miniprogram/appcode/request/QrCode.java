package com.arleex.wechat.miniprogram.appcode.request;

import com.arleex.wechat.miniprogram.appcode.AppCode;

public class QrCode implements AppCode {

    private String path;
    private Integer width = 430;

    public QrCode(String path, Integer width) {
        this.path = path;
        this.width = width;
    }
}
