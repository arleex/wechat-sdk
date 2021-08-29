package com.arleex.wechat.miniprogram.api.auth;

/**
 * @author spaco
 */
public interface AuthService {

    /**
     * @param jsCode
     * @return
     */
    public String code2Session(String jsCode);
}
