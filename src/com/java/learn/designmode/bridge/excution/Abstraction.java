package com.java.learn.designmode.bridge.excution;

/**
 * 桥接模式组件：抽象化角色，扩展抽象化角色（持有实现化角色引用），实现化，具体实现化
 * 扩展：可与适配器模式组合，当桥接模式的实现化接口无法与现有接口一致是，可以在二者中间定义适配器
 * 将二者链接起来
 *
 * 自己组合的可能不够准确
 */
public abstract class Abstraction {

    protected Realize realize;

    public Abstraction(Realize realize){
        this.realize = realize;
    }

    protected abstract void lock();
}
