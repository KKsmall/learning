package com.java.learn.jdk8.test1;

import java.util.function.Function;

/**
 * 基于lambda表达式的函数式编程
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(5, value -> value * 2));
        System.out.println(functionTest.compute(5, value -> value + 2));
        //可以转化为
        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(functionTest.compute(3, function));
    }

    /**
     *  函数编程的好处，该方法定义的是通用方法，具体实现可以用function，而不用向面向对象编程那样
     *  定义很多方法接收不同的参数
     * @param i
     * @param function 用于接收函数，lambda：value -> value * 2传递的不是值，而是一个行为
     *              function.apply(i)接受i参数并且执行行为的逻辑，即5 * 2
     * @return
     */
    public int compute(int i, Function<Integer, Integer> function) {
        int result = function.apply(i);
        return result;
    }
}
