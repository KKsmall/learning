package com.java.learn.designmode.adapter;

/**
 * 适配器1
 */
public class Adapter1 implements Target {

    private Adaptee1 adaptee1;

    public Adapter1(Adaptee1 adaptee1) {
        this.adaptee1 = adaptee1;
    }

    @Override
    public void doIt() {
        adaptee1.say();
    }

    public static void main(String[] args) {
        Adapter1 adapter1 = new Adapter1(new Adaptee1());
        adapter1.doIt();
    }
}
