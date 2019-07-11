package com.java.learn.designmode.singleton;

/**
 * 单例模式，双重锁
 */
public class Singleton {
    private static volatile Singleton singleton = null;
    private Singleton(){}
    public Singleton getSingleton() {
        if (singleton == null) {
            synchronized (this) {
                if (singleton == null) {
                    singleton = new Singleton();
                    System.out.println("======创建啦======");
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton a = new Singleton();
        a.getSingleton();
    }
}
