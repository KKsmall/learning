package com.java.learn.jdk8.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 可以用于对集合的处理空的时候返回[]而不是null
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Emplyee emplyee = new Emplyee("sdfsf",10);
        Emplyee emplyee1 = new Emplyee("sdfsf",10);
        Emplyee emplyee2 = new Emplyee("sdfsf",10);

        List<Emplyee> list = Arrays.asList(emplyee, emplyee1, emplyee2);

        Company company = new Company("feweee", list);

        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(theCompany -> theCompany.getList()).orElse(Collections.emptyList()));
    }
}
