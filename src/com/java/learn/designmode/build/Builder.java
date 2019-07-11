package com.java.learn.designmode.build;

/**
 * 具体建造者，该类可多个
 */
public class Builder extends Build {
    @Override
    void set1() {
        product.setSttr1("属性1");
        System.out.println("=====设置属性1=====");
    }

    @Override
    void set2() {
        product.setSttr2("属性2");
        System.out.println("=====设置属性2=====");
    }

    @Override
    void set3() {
        product.setSttr3("属性3");
        System.out.println("=====设置属性3=====");
    }
}
