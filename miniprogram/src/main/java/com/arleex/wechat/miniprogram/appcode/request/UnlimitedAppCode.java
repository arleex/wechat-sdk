package com.arleex.wechat.miniprogram.appcode.request;

import com.arleex.wechat.miniprogram.appcode.AppCode;

public class UnlimitedAppCode implements AppCode {
    private String scene;

    private String page;

    private Integer width = 430;

    private boolean autoColor = false;

    private boolean isHyaline = false;

    private LineColor lineColor = new LineColor("0", "0", "0");

    public class LineColor {
        private String r = "0";
        private String g = "0";
        private String b = "0";

        public LineColor(String r, String g, String b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }
}
