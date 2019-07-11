package com.java.learn.designmode.template;

/**
 * 具体子类
 */
public class ConcreteClass extends AbstractClass{
    @Override
    protected void method3() {
        System.out.println("======子类方法3====");
    }

    @Override
    protected void method2() {
        System.out.println("======子类方法2====");
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.method();
    }
}
