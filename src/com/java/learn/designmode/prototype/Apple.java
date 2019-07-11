package com.java.learn.designmode.prototype;

/**
 * 原型模式：用于复制相同或相似对象
 */
public class Apple implements Cloneable{

    public Apple() {
        System.out.println("创建的是苹果");
    }

    public Object clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Apple apple1 = new Apple();
        Apple apple2 = (Apple)apple1.clone();
//      apple2.setXXX()这里可以对属性做修改，只改变我们要改变的属性，就是复制了相似对象了
        System.out.println(apple1 == apple2);
        System.out.println(apple1.equals(apple2));
    }
}
