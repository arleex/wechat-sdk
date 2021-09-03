package com.arleex.wechat.miniprogram.api.subscribemessage.request;

import com.arleex.wechat.miniprogram.constant.MiniProgramConstant;

import java.io.Serializable;
import java.util.List;

/**
 * @author spaco
 */
public class SubscribeMessageRequest implements Serializable {
    /**
     * <pre>
     * 说明：接收者（用户）的 openid.
     * 默认值：
     * 必填： 是
     * </pre>
     */
    private String toUser;

    /**
     * 所需下发的模板消息的id
     * <pre>
     * 说明：所需下发的模板消息的id
     * 属性：template_id
     * 必填： 是
     * </pre>
     */
    private String templateId;

    private String page;

    private List<Data> data;

    private String miniprogrameState = MiniProgramConstant.MiniProgramState.FORMAL;

    /**
     * 进入小程序查看”的语言类型，支持zh_CN(简体中文)、en_US(英文)、zh_HK(繁体中文)、zh_TW(繁体中文)，默认为zh_CN
     */
    private String lang = MiniProgramConstant.MiniProgramLang.ZH_CN;

    public static class Data {
        private String key;
        private String value;
    }
}
