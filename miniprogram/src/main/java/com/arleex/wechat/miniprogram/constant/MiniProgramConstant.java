package com.arleex.wechat.miniprogram.constant;

/**
 * 微信小程序常量
 *
 * @author spaco
 */
public class MiniProgramConstant {

    private static final String BASE_URL = "https://qyapi.weixin.qq.com/";


    /**
     * 小程序类型
     */
    public static class MiniProgramState {
        /**
         * 开发版
         */
        public static final String DEVELOPER = "developer";

        /**
         * 体验版
         */
        public static final String TRIAL = "trial";

        /**
         * 正式版
         */
        public static final String FORMAL = "formal";
    }

    public static class MiniProgramLang {

        /**
         * 简体中文
         */
        public static final String ZH_CN = "zh_CN";

        /**
         * 英文
         */
        public static final String EN_US = "en_US";

        /**
         * 繁体中文
         */
        public static final String ZH_HK = "zh_HK";

        /**
         * 繁体中文
         */
        public static final String ZH_TW = "zh_TW";
    }

}
