package com.java.learn.designmode.factorymethod;

public class Test {
    public static void main(String[] args) {
        AbstrcatFactory factory1 = new Factory1();
        AbstrcatFactory factory2 = new Factory2();
        Product product1 = factory1.newProduct();
        Product product2 = factory2.newProduct();
        product1.say();
        product2.say();
    }
}
