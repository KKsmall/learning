package com.java.learn.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        //初始1开始之后的乘2，限制求6个数
        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
        /**
         * 找出大于2的每个平方，然后忽略前两个后再取出剩余的前两个求和
         * mapToInt直接返回的是int类型，如果用map的话还需要有装箱拆箱的过程，因为map泛型是对象只能是Integer
         */
//        stream.filter(integer -> integer > 2).mapToInt(i -> i * i).skip(2).limit(2).sum();
//        stream.filter(integer -> integer > 2).mapToInt(i -> i * i).skip(2).limit(2).min().ifPresent(System.out::println);

//        stream.filter(integer -> integer > 2).mapToInt(i -> i * 2).skip(2).limit(2).forEach(System.out::println);
        //summaryStatistics 包含求最小值求和等操作
        IntSummaryStatistics summaryStatistics = stream.filter(integer -> integer > 2).mapToInt(i -> i * 2).skip(2).limit(2).summaryStatistics();
//        summaryStatistics.getCount();
        System.out.println(summaryStatistics.getMin());
    }
}
