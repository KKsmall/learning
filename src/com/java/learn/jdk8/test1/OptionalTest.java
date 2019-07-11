package com.java.learn.jdk8.test1;

import java.util.Optional;

/**
 * Optional是一个容器，提供的工厂方法，可以用来处理判空
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optionalS = Optional.ofNullable(null);//把需要判空的元素放入容器
//        Optional<String> optionalS = Optional.empty();//创建空的

        //这种和传统的if(null == xx)没区别
//        if (optionalS.isPresent()) {
//            .....
//        }

        //这种基于才是基于函数式的判空
        optionalS.ifPresent(item -> System.out.println(item)); //如果容器的参数不为空则打印为空则不处理
        optionalS.orElse("nihao"); //为空则打印
        optionalS.orElseGet(() -> "dfafa");
    }
}
