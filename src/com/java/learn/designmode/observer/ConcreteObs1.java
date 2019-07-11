package com.java.learn.designmode.observer;

public class ConcreteObs1 implements Observer {
    @Override
    public void say() {
        System.out.println("=======观察者1调用======");
    }
}
