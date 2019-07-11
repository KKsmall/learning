package com.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流的几种创建形式
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream stream = Stream.of("sdfsdf","dsfsdf");

        String[] strings = new String[] {"sdfs","sdfsd"};
        Stream stringStream = Stream.of(strings);

        List<String> list = Arrays.asList("sdfs","sdfsd");
        Stream stringStream2 = list.stream();
    }
}
