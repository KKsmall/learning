package com.java.learn.designmode.singleton;

/**
 * 饿汉模式
 */
public class Singleton2 {
    private static final Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance() {
        return singleton2;
    }
}
