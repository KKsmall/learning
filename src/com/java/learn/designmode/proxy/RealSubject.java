package com.java.learn.designmode.proxy;

/**
 * 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void say() {
        System.out.println("=======你好哦===");
    }
}
