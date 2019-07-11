package com.java.learn.designmode.bridge.excution;

public class AdapteeReal implements Adaptee {
    @Override
    public void say() {
        System.out.println("====适配者1====");
    }
}
