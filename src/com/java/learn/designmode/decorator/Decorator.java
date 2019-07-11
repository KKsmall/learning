package com.java.learn.designmode.decorator;

/**
 * 抽象装饰着
 */
public class Decorator{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void test() {
        component.hello();
    }
}
