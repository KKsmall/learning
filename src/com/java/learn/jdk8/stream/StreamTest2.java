package com.java.learn.jdk8.stream;

import java.util.stream.IntStream;

/**
 * 流的用法
 */
public class StreamTest2 {
    public static void main(String[] args) {
        int[] integers = new int[] {1,2,3,4,5};
        IntStream.of(integers).forEach(System.out::println);
        System.out.println("-------------");

        //[3, 8)
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("-------------");
        //[3, 8]
        IntStream.rangeClosed(3, 8).forEach(System.out::println);
    }
}
