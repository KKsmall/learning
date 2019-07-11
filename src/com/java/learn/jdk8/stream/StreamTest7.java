package com.java.learn.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stream中的分组与分区
 */
public class StreamTest7 {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 10, 80);
        Student student1 = new Student("zhangsan", 10, 70);
        Student student2 = new Student("liuliu", 15, 90);
        Student student3 = new Student("zhaoliu", 20, 60);

        List<Student> list = Arrays.asList(student, student1, student2, student3);

        //按姓名分组
//        Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));
        //按名字分组，求每个分组的个数
//        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        //按名字分组求每个分组的平均分数
        Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(map);

        //---分区,key为boolean
        Map<Boolean, List<Student>> map1 = list.stream().collect(Collectors.partitioningBy(item -> item.getScore() >= 80));
        System.out.println(map1);
    }
}
