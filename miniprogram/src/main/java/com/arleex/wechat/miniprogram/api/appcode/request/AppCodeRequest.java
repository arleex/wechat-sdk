package com.arleex.wechat.miniprogram.api.appcode.request;


/**
 * @author cat
 */
public class AppCodeRequest {

    private String path;

    private Integer width = 430;

    private Boolean autoColor = false;

    private Boolean isHyaline = false;

    private LineColor lineColor = new LineColor("0", "0", "0");

    public static class LineColor {
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
