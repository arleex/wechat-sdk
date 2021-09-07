package com.arleex.wechat.miniprogram.api.appcode.request;


import lombok.Builder;
import lombok.Data;

/**
 * @author cat
 */
@Builder
@Data
public class QrCodeRequest {

    private String path;

    private Integer width = 430;

}
