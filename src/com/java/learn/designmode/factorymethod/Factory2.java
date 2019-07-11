package com.java.learn.designmode.factorymethod;

public class Factory2 implements AbstrcatFactory {
    @Override
    public Product newProduct() {
        return new Product2();
    }
}
