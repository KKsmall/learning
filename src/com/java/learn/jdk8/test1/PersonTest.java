package com.java.learn.jdk8.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * 函数式编程和流，实现从已有的集合中选出符合的对象作为新的集合
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("zhangshan", 10);
        Person person1 = new Person("lisi", 20);
        Person person2 = new Person("wanwu", 30);

        List<Person> list = Arrays.asList(person, person1, person2);
        PersonTest test = new PersonTest();
//        List<Person> personList = test.compute("lisi", list);
//        personList.forEach(per -> System.out.println(per.getName()));
//
//        List<Person> personList1 = test.compute2(20, list);
//        personList1.forEach(per -> System.out.println(per.getAge()));

        List<Person> listPerson = test.compute3(20, list, (age, persons) ->
                persons.stream().filter(person3 -> person3.getAge() >= age).collect(Collectors.toList()));
        listPerson.forEach(person3 -> System.out.println(person3.getAge()));
    }

    /**
     * filter中的参数是一个函数：Predicate<? super T> 该函数用于接收一个参数返回一个布尔值
     * 最后通过collect把符合要求的对象重新组合
     * @param name
     * @param list
     * @return
     */
    public List<Person> compute(String name, List<Person> list) {
        return list.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }

    /**
     * 处理年龄大于的集合，跟上面的其实差不多
     * @param age
     * @param list
     * @return
     */
    public List<Person> compute2(int age, List<Person> list) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) ->
                personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        return biFunction.apply(age, list);
    }

    /**
     * 把BiFunction提取到外层，具体的过滤函数可以在方法调用的时候实现
     * @param age
     * @param list
     * @param biFunction
     * @return
     */
    public List<Person> compute3(int age, List<Person> list, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, list);
    }

}
