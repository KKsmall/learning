package com.java.learn.designmode.bridge;

/**
 * 扩展抽象化
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Realize realize) {
        super(realize);
    }

    @Override
    protected void lock() {
        realize.hello();
    }

    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new RefinedRealize());
        refinedAbstraction.lock();
    }
}
