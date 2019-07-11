package com.java.learn.designmode.factorymethod;

/**
 * 工厂方法包括4个对象：抽象工厂，具体工厂，抽象产品，具体产品,
 * 抽象工厂方法和工厂方法类似，只是抽象工厂方法的抽象接口中定义多个newProduct方法
 * 用来生成同一个工厂中的同族不同等级的产品(如海尔工厂，电视机和洗衣机同族)
 */
public interface AbstrcatFactory {

    Product newProduct();

    //Product newXiYiJi();
    //Product newDianShiJi();
}
