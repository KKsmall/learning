package com.java.learn.designmode.prototype;

import com.java.learn.designmode.prototype.face.Fruit;

import java.util.HashMap;

/**
 * 原型模式扩展，原型管理类
 */
public class ProtyTypeManager {

    private HashMap<String, Fruit> map = new HashMap<>();

    public void add(String key, Fruit fruit){
        map.put(key, fruit);
    }

    public Fruit get(String key) throws CloneNotSupportedException {
        Fruit fruit = map.get(key);
        return fruit.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtyTypeManager manager = new ProtyTypeManager();
        manager.add("apple", new Apples());
        manager.add("banana", new Banana());

        manager.get("apple");
    }
}
