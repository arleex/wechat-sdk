package com.arleex.wechat.miniprogram.appcode.request;


/**
 * @author cat
 */
public class AppCode{

    private String path;

    private Integer width = 430;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Boolean getAutoColor() {
        return autoColor;
    }

    public void setAutoColor(Boolean autoColor) {
        this.autoColor = autoColor;
    }

    public Boolean getHyaline() {
        return isHyaline;
    }

    public void setHyaline(Boolean hyaline) {
        isHyaline = hyaline;
    }

    public LineColor getLineColor() {
        return lineColor;
    }

    public void setLineColor(LineColor lineColor) {
        this.lineColor = lineColor;
    }

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
