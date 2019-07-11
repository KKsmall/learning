package com.java.learn.designmode.factorymethod;

public class Factory1 implements AbstrcatFactory {
    @Override
    public Product newProduct() {
        return new Product1();
    }
}
