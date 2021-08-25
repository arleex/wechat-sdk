package com.arleex.wechat.miniprogram.appcode;


public interface Repository {
    public void createQRCode(String path,AppCode appCode);

    public void get(String path,AppCode appCode);

    public void getUnlimited(String scene,AppCode appCode);

    public void createQRCode(String path);

    public void get(String path);

    public void getUnlimited(String scene);
}
