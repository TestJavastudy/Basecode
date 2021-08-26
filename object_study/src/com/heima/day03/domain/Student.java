package com.heima.day03.domain;

import java.util.ArrayList;

public class Student {
    private String Sno;
    private String name;
    private int age;
    public Student() {
    }

    public Student(String sno, String name, int age) {
        Sno = sno;
        this.name = name;
        this.age = age;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age  = age;

    }
}
