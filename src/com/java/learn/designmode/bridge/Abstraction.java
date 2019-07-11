package com.java.learn.designmode.bridge;

/**
 * 桥接模式组件：抽象化角色，扩展抽象化角色（持有实现化角色引用），实现化，具体实现化
 */
public abstract class Abstraction {

    protected Realize realize;

    public Abstraction(Realize realize){
        this.realize = realize;
    }

    protected abstract void lock();
}
