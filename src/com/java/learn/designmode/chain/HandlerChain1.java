package com.java.learn.designmode.chain;

public class HandlerChain1 extends Handler {
    @Override
    public void request(String key) {
        if ("one".equalsIgnoreCase(key)) {
            System.out.println("===具体处理者1处理====");
        } else if (getNext() != null){
            getNext().request(key);
        } else {
            System.out.println("=====没人处理======");
        }
    }
}
