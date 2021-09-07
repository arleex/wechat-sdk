package com.arleex.wechat.miniprogram.api.appcode;

import com.arleex.wechat.miniprogram.Application;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppCodeServiceImplTest {

    @Test
    void createQrCode() {
        new Application().appCode().createQrCode("ds");
    }

    @Test
    void get() {
    }

    @Test
    void getUnlimited() {
    }

    @Test
    void testCreateQrCode() {
    }

    @Test
    void testGet() {
    }

    @Test
    void testGetUnlimited() {
    }
}