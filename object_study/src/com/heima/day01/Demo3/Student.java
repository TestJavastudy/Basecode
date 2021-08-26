package com.heima.day01.Demo3;

public class Student {
    private int age;

    /**
     * 构造方法可以用于给对象中的属性值的初始化
     * @param age
     */
    public Student(int age) {
        this.age = age;
        System.out.println("这是一个构造方法");
    }

    public Student() {
        System.out.println("我是构造方法");
    }
}
