package com.java.learn.jdk8.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * lambda表达式一般要求实现lambda的对象是一个函数是接口，
 * 接一个接口中只有一个抽象方法，重写object类中的方法不算一个抽象方法
 */
@FunctionalInterface
interface TestInterface1 {
    void test1();
}

class Test2 {
    public void test2(TestInterface1 interface1) {
        System.out.println("测试");
    }
}

public class TestLambda {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        //这两句不会被打印
        test2.test2(() -> System.out.println("添加测试"));
        //::表示的是方法引用，冒号左边是类，右边是类的方法
        test2.test2(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.forEach(System.out::println);
        //流处理,等同
        list.stream().map(i -> i.getBytes()).forEach(System.out::println);
        list.stream().map(String::getBytes).forEach(System.out::println);
    }
}
