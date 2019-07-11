package com.java.learn.designmode.prototype;

import com.java.learn.designmode.prototype.face.Fruit;

public class Apples implements Fruit {

    public Apples(){}

    @Override
    public void eat() {
        System.out.println("开动啦");
    }

    public Apples clone() throws CloneNotSupportedException {
        System.out.println("=======我是苹果===");
        return (Apples) super.clone();
    }
}
