package com.java.learn.designmode.build;

/**
 * 抽象构建者 定义产品各属性的创建方法，以及返回产品对象的方法
 */
public abstract class Build {

    protected Product product = new Product();
    abstract void set1();
    abstract void set2();
    abstract void set3();

    public Product getProduct() {
        System.out.println("=====建造产品=====");
        return product;
    }
}
