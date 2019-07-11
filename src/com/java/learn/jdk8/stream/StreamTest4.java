package com.java.learn.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("dsfsd","dsfs","sfsd");

        /**
         * <A> A[] toArray(IntFunction<A[]> generator);
         * IntFunction这里是接收一个值返回一个数组对象
         */
        String[] strings = stringStream.toArray(length -> new String[length]);
        Arrays.asList(strings).forEach(System.out::println);
        System.out.println("------------------");

        Stream<String> stringStream2 = Stream.of("aaa","bbb","cccc");
        //最直接
//        stringStream2.collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------------");
        /**
         * <R> R collect(Supplier<R> supplier,
         *                   BiConsumer<R, ? super T> accumulator,
         *                   BiConsumer<R, R> combiner);
         * Supplier不接受参数返回一个值，BiConsumer接受两个参数不返回值
         * 第一个参数为要返回的集合，第二个参数遍历流中的每个参数，聚合第二个参数遍历的结果，也是最终的返回值，
         * 对应第一个参数的返回类型
         * 这里如果返回的类型是ArrayList那和上面的Collectors.toList()没区别，如果是返回其他类型就要像这样定义
         */
        stringStream2.collect(() -> new ArrayList<String>(), (theList, item) -> theList.add(item),
                (theList1, theList2) -> theList1.addAll(theList2)).forEach(System.out::println);
        System.out.println("------------------");
        //和上面一样只是用方法引用的方式
//        stringStream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll).forEach(System.out::println);
    }
}
