package com.java.learn.designmode.adapter.extension;

public class TargetReal implements Target {
    @Override
    public void doIt() {
        System.out.println("====真正目标接口====");
    }
}
