package com.java.learn.jdk8.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2,3,4,5,6,7,8,9,10);

        PredicateTest test = new PredicateTest();
        test.compute(list, item -> item < 5);
        System.out.println("-------------");
        test.compute(list, item -> true);   //展示全部
        System.out.println("-------------");
        test.compute(list, item -> false);   //全部不展示
        System.out.println("-------------");

        test.compute2(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("-------------");
    }

    public void compute(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(integer -> {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        });
    }

    /**
     * 多条件判断
     */
    public void compute2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        list.forEach(integer -> {
            //and表示predicate和predicate2都满足
            if (predicate.and(predicate2).test(integer)) {
                System.out.println(integer);
            }
        });
    }
}
