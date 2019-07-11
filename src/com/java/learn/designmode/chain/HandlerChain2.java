package com.java.learn.designmode.chain;

public class HandlerChain2 extends Handler {
    @Override
    public void request(String key) {
        if ("two".equalsIgnoreCase(key)) {
            System.out.println("===具体处理者2处理====");
        } else if (getNext() != null){
            getNext().request(key);
        } else {
            System.out.println("=====没人处理======");
        }
    }

    public static void main(String[] args) {
        Handler handler1 = new HandlerChain1();
        Handler handler2 = new HandlerChain2();
        handler1.setNext(handler2);
        handler1.request("ewrw");
    }
}
