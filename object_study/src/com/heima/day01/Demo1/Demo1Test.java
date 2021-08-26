package com.heima.day01.Demo1;

public class Demo1Test {
    public static void main(String[] args) {
        /**
         * 1、使用对象是必须使用new对象
         * 格式：类名 对象名= new 类名（）；
         */
        Student stu1 = new Student();
        stu1.study();
        /**
         * 类属性使用方法
         * 格式：
         * 对象名.属性
         * 对象名.方法
         */
        stu1.age = 10;
        stu1.academy ="传智播客";
        stu1.name = "王少";
        System.out.println(stu1.name+" "+stu1.age+" "+ stu1.academy);
    }
}

