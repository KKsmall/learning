package com.java.learn.designmode.decorator;

/**
 * 具体构件
 */
public class ConcreteComponent implements Component{
    @Override
    public void hello() {
        System.out.println("====你好========");
    }
}
