package com.java.learn.designmode.bridge.excution;

/**
 * 扩展抽象化
 */
public class RefinedAbstraction extends Abstraction {

    public Adapter realize;

    //这里传的是适配器，此时的适配器是实现化的子类
    public RefinedAbstraction(Adapter realize) {
        super(realize);
        this.realize = realize;
    }

    @Override
    protected void lock() {
        realize.say();
    }

    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new Adapter());
        refinedAbstraction.lock();
    }
}
