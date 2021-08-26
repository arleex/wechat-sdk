package com.arleex.wechat.miniprogram.appcode;


import com.arleex.wechat.miniprogram.appcode.request.AppCode;
import com.arleex.wechat.miniprogram.appcode.request.QrCode;
import com.arleex.wechat.miniprogram.appcode.request.UnlimitedAppCode;

/**
 * @author cat
 */
public interface AppCodeService {
    /**
     * @param path
     * @param appCode
     */
    public void createQrCode(String path, QrCode qrCode);

    /**
     * @param path
     * @param appCode
     */
    public void get(String path, AppCode appCode);

    /**
     * @param scene
     * @param appCode
     */
    public void getUnlimited(String scene, UnlimitedAppCode appCode);

    /**
     * @param path
     */
    public void createQrCode(String path);

    /**
     * @param path
     */
    public void get(String path);

    /**
     * @param scene
     */
    public void getUnlimited(String scene);
}
