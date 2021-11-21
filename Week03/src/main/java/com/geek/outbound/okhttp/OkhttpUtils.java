package com.geek.outbound.okhttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * 类描述：
 *
 * @ClassName OkhttpUtils
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/21 14:39
 * @Version 1.0
 */
public class OkhttpUtils {
    public static OkHttpClient okHttpClient = new OkHttpClient();

    public static String getBody(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        return response.body().string();
    }
}
