package com.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest6 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "world wecome", "hello wecome");
        /**
         * 要实现去重，此方法不行因为item.split(" ")返回的是String[]所以map返回的流就是Stream<String[]>,
         * 每个数组肯定不一样，这里去重就无效了
         */
//        list.stream().map(item -> item.split(" ")).distinct().forEach(System.out::println);
        /**
         * 使用flatMap,把多个扁平成一个流,Arrays::stream方法引用是接收一个数组转成一个流,然后flatMap把多个流扁平成一个
         */
        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

        List<String> list1 = Arrays.asList("hi","nihao","hehe");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
        /**
         * 这里flatMap不能用map代替，因为list2.stream().map(item2 -> item + " " + item2)的map返回的是一个流而不是字符串，
         * 所以需要用flatMap把多个流扁平为1个流，否则用flatMap替换为map遍历打印的是流对象
         */
        list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).forEach(System.out::println);
    }
}
