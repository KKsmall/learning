package com.java.learn.designmode.template;

/**
 * 模板方法组件：抽象类，具体子类
 */
public abstract class AbstractClass {

    public void method() {
        method1();
        method2();
        method3();
    }

    protected abstract void method3();

    protected abstract void method2();

    protected  void method1(){
        System.out.println("=========抽象类已实现方法========");
    }
}
