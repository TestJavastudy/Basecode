package com.heima.StuDemo.domain;

public class Student {
    private String sno;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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
        this.age = age;
    }
}
