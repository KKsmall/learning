package com.java.learn.netty.test4;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

public class MyServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();

        //IdleStateHandler空闲状态handler:5服务器读空闲即5秒内没读，7写空闲，4读写空闲
        channelPipeline.addLast(new IdleStateHandler(5, 7, 4))
                .addLast("myServerHandler",new MyServerHandler());
    }
}
