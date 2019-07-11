package com.java.learn.jdk8.test1;

import java.util.List;

public class Company {
    private String company;
    private List<Emplyee> list;

    public Company(String company, List<Emplyee> list) {
        this.company = company;
        this.list = list;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Emplyee> getList() {
        return list;
    }

    public void setList(List<Emplyee> list) {
        this.list = list;
    }
}
