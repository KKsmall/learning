package com.java.learn.designmode.adapter.extension;

public class AdapteeReal implements Adaptee{
    @Override
    public void say() {
        System.out.println("====适配者1====");
    }
}
