package com.arleex.wechat.miniprogram.common.httpclient.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cat
 */
public class HttpClientFactory {
    private static final Map<String, HttpClientStrategy> MACHINE_ALARM_STRATEGY_MAP = new HashMap<>();

    public static HttpClientStrategy getStrategy(String key) {
        return MACHINE_ALARM_STRATEGY_MAP.getOrDefault(key, MACHINE_ALARM_STRATEGY_MAP.get("okhttp"));
    }
}
