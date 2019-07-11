package com.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 集合中的数*2再求和
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //reduce初始为0
        System.out.println(list.stream().map(i -> i*2).reduce(0, Integer::sum));
    }
}
