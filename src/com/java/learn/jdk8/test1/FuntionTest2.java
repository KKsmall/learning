package com.java.learn.jdk8.test1;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * function的串联
 */
public class FuntionTest2 {
    public static void main(String[] args) {
        FuntionTest2 test2 = new FuntionTest2();
        System.out.println(test2.compute1(2, value -> value + 1));
        //先3+5 -> 8 * 2 = 16
        System.out.println(test2.compute2(3, value -> value * 2, value -> value + 5));
        //4 / 2 -> 2-5 = -3
        System.out.println(test2.compute3(4, value -> value / 2, value -> value - 5));

        System.out.println(test2.compute4(1, 2, (value1, value2) -> value1 * value2));
        //BiFuntion调用: 3 * 4 -> 12 * 2 = 24
        System.out.println(test2.compute5(3, 4, (value1, value2) -> value1 * value2, value -> value * 2));

    }

    //一个function
    public int compute1(int i, Function<Integer, Integer> funtion) {
        return funtion.apply(i);
    }

    //先求function2.apply返回的结果在传递给funtion.apply
    public int compute2(int i, Function<Integer, Integer> funtion, Function<Integer, Integer> funtion2) {
        return funtion.compose(funtion2).apply(i);
    }

    //先function在function2
    public int compute3(int i, Function<Integer, Integer> funtion, Function<Integer, Integer> funtion2) {
        return funtion.andThen(funtion2).apply(i);
    }

    //可以使用BiFunction来接收两个参数返回一个值，上面的funtion只能接收一个参数
    //BiFunction<Integer, Integer, Integer>参数分别表示前两个参数的类型和返回值类型
    public int compute4(int i, int j, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(i, j);
    }

    //BiFuntion的串联只有andThen方法
    //这里andThen(function)为什么是传递的Funtion而不是BiFuntion呢？：
    //因为是先执行biFuntion.apply，该方法是接收两个参数返回一个结果，所有andTen的函数只能是接收一个参数的即为function
    public int compute5(int i, int j, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(i, j);
    }
}
