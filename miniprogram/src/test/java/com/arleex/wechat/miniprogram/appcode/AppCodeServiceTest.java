package com.arleex.wechat.miniprogram.appcode;

import com.arleex.wechat.miniprogram.appcode.request.AppCode;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class AppCodeServiceTest {

    @Resource
    protected AppCodeService appCodeService;

    @Test
    void testCreateQrCode() {
        this.ad(new B());

//        appCodeService.createQrCode("ds");
        assertEquals(1,1);
//        System.out.println(1);
    }

//    @Test
//    void testGet() {
//    }
//
//    @Test
//    void testGetUnlimited() {
//    }

    public void ad(B appCode)
    {
        System.out.print(appCode.getPath());
    }

    public class B extends AppCode{
        private String path = "ds";

        @Override
        public String getPath() {
            return path;
        }

        @Override
        public void setPath(String path) {
            this.path = path;
        }
    }

    public class A {
        protected String a = "a";

    }
}
