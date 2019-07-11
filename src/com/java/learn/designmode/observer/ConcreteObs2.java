package com.java.learn.designmode.observer;

public class ConcreteObs2 implements Observer {
    @Override
    public void say() {
        System.out.println("=======观察者2调用======");
    }
}
