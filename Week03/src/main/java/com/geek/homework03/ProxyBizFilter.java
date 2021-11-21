package com.geek.homework03;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;

/**
 * 类描述：
 *
 * @ClassName ProxyBizFilter
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/21 13:26
 * @Version 1.0
 */
public class ProxyBizFilter {

    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        fullRequest.headers().set("geek","hello,request");
    }

     public void filter(FullHttpResponse response) {
        response.headers().set("geek", "hello,response");
    }
}
