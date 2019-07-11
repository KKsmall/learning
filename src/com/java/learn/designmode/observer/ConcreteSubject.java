package com.java.learn.designmode.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        list.forEach(item -> item.say());
    }

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.set(new ConcreteObs1());
        subject.set(new ConcreteObs2());
        subject.notifyObserver();
    }
}
