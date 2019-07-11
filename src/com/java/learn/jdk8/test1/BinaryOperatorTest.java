package com.java.learn.jdk8.test1;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {

        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute("a", "b", (a, b) -> a + b));

        System.out.println(test.compute2("afsdf", "b", (a, b) -> a.length() - b.length()));
    }

    public String compute(String a, String b, BinaryOperator<String> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    //传入一个比较器返回小的值
    public String compute2(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
