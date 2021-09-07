package com.arleex.wechat.miniprogram.api.appcode;


import com.arleex.wechat.miniprogram.api.appcode.request.AppCodeRequest;
import com.arleex.wechat.miniprogram.api.appcode.request.QrCodeRequest;
import com.arleex.wechat.miniprogram.api.appcode.request.UnlimitedAppCodeRequest;
import com.arleex.wechat.miniprogram.base.BaseServiceImpl;
import com.arleex.wechat.miniprogram.constant.MiniProgramApiConstant;

/**
 * @author cat
 */
public class AppCodeServiceImpl extends BaseServiceImpl implements AppCodeService
{

    @Override
    public void createQrCode(String path, QrCodeRequest qrCodeRequest) {

    }

    @Override
    public void get(String path, AppCodeRequest appCodeRequest) {

    }

    @Override
    public void getUnlimited(String scene, UnlimitedAppCodeRequest unlimitedAppCodeRequest) {

    }

    @Override
    public void createQrCode(String path) {
    }

    @Override
    public void get(String path) {

    }

    @Override
    public void getUnlimited(String scene) {

    }
}
