package com.arleex.wechat.miniprogram.appcode;


/**
 * @author cat
 */
public interface Repository {
    /**
     * @param path
     * @param appCode
     */
    public void createQrCode(String path, AppCodeRequest appCode);

    /**
     * @param path
     * @param appCode
     */
    public void get(String path, AppCodeRequest appCode);

    /**
     * @param scene
     * @param appCode
     */
    public void getUnlimited(String scene, AppCodeRequest appCode);

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
