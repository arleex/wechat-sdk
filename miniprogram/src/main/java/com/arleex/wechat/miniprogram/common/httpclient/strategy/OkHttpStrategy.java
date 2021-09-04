package com.arleex.wechat.miniprogram.common.httpclient.strategy;

import okhttp3.*;

import java.io.IOException;

/**
 * @author cat
 */
public class OkHttpStrategy implements HttpClientStrategy {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    @Override
    public String httpPost(String url, String data) throws IOException {
        RequestBody body = RequestBody.create(JSON, data);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    @Override
    public String type() {
        return "okhttp";
    }
}
