package com.java.learn.designmode.decorator;

/**
 * 具体装饰者
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void hello() {
        super.test();
        System.out.println("=======新功能=======");
    }

    public static void main(String[] args) {
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(new ConcreteComponent());
        concreteDecorator.hello();
    }
}
