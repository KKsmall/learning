package com.java.learn.designmode.prototype.face;

public interface Fruit extends Cloneable{
    void eat();
    Fruit clone() throws CloneNotSupportedException;
}
