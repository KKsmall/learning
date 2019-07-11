package com.java.learn.designmode.singleton;

/**
 * 懒汉模式
 */
public class Singleton1 {
    private static volatile Singleton1 singleton1 = null;
    private Singleton1(){}

    public static synchronized Singleton1 getSingleton() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
