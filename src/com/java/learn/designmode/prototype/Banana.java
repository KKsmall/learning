package com.java.learn.designmode.prototype;

import com.java.learn.designmode.prototype.face.Fruit;

public class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("开吃啦");
    }

    public Banana(){}

    public Banana clone() throws CloneNotSupportedException {
        System.out.println("========我是香蕉======");
        return (Banana) super.clone();
    }
}
