package com.java.learn.designmode.build;

/**
 * 建造者模式：用于对复杂对象各个属性的构建
 * 组件有：产品对象，抽象构建者，具体构建者，指挥者
 */
public class Product {

    //属性
    private String sttr1;
    private String sttr2;
    private String sttr3;

    public void setSttr1(String sttr1) {
        this.sttr1 = sttr1;
    }

    public void setSttr2(String sttr2) {
        this.sttr2 = sttr2;
    }

    public void setSttr3(String sttr3) {
        this.sttr3 = sttr3;
    }

    public void show() {
        System.out.println("====哈哈====");
    }
}
