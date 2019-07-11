package com.java.learn.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式组件：抽象主题(对观察者进行添加，通知等操作)，具体主题，抽象观察者，具体观察者
 */
public abstract class Subject {

    protected List<Observer> list = new ArrayList<>();

    void set(Observer observer) {
        list.add(observer);
        //可以在set步骤的时候对观察者进行通知
//        notifyObserver();
    }

    void remove(Observer observer) {
        list.remove(observer);
    }

    //通知观察者
    public abstract void notifyObserver();
}
