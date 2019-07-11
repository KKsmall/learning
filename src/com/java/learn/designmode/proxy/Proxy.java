package com.java.learn.designmode.proxy;

import com.java.learn.designmode.proxy.dynamic.RealSubject;
import com.java.learn.designmode.proxy.dynamic.Subject;

/**
 * 代理类，和真实主题实现共同接口
 */
public class Proxy implements Subject {

    private Subject subject;

    @Override
    public void say() {
        if (subject == null) {
            subject = new RealSubject();
        }
        System.out.println("=====pre===");
        subject.say();
        System.out.println("=====after=====");
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.say();
    }
}
