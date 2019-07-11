package com.java.learn.designmode.build;

/**
 * 指挥者
 */
public class Director {

    private Builder builder;

    //接受想要的建造者
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void contruct() {
        builder.set1();
        builder.set2();
        builder.set3();
        builder.getProduct();
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        Director director = new Director(builder);
        director.contruct();
    }
}
