package com.arleex.wechat.miniprogram.api.appcode;


import com.arleex.wechat.miniprogram.api.appcode.request.AppCodeRequest;
import com.arleex.wechat.miniprogram.api.appcode.request.QrCodeRequest;
import com.arleex.wechat.miniprogram.api.appcode.request.UnlimitedAppCodeRequest;

/**
 * @author cat
 */
public interface AppCodeService {

    public void createQrCode(String path, QrCodeRequest qrCodeRequest);


    public void get(String path, AppCodeRequest appCodeRequest);


    public void getUnlimited(String scene, UnlimitedAppCodeRequest unlimitedAppCodeRequest);

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
