package com.java.learn.jdk8.test1;

import java.util.function.Supplier;

/**
 * Supplier函数不接受参数返回一个值
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());

        //不接受参数返回一个结果
//        Supplier<Student> studentSupplier = () -> new Student();
        //跟上面的一样 调用Student里的无参构造函数，Supplier会自动识别符合的无参条件
        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get().getName());
    }

    public Student compute() {
        Supplier<Student> studentSupplier = Student::new;
        return studentSupplier.get();
    }
}
