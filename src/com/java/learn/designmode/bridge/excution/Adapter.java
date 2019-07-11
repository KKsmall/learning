package com.java.learn.designmode.bridge.excution;

/**
 * 适配器,实现目标实现化接口
 */
public class Adapter extends RefinedRealize implements Adaptee{

    private Realize realize;

    public Adapter(Realize realize) {
        this.realize = realize;
    }

    @Override
    public void say() {
        realize.hello();
        System.out.println("===============");
    }
}
