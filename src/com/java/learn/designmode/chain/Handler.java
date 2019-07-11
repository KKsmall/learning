package com.java.learn.designmode.chain;

/**
 * 责任链模式组件：抽象处理者，具体处理者，客户端
 */
public abstract class Handler {

    private Handler handler;

    void setNext(Handler handler) {
        this.handler = handler;
    }

    Handler getNext() {
        return handler;
    }

    //抽象处理方法
    public abstract void request(String key);
}
