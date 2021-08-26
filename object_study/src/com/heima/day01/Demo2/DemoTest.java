package com.heima.day01.Demo2;

public class DemoTest {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.setName("张三");
        stu.setAge(18);
        System.out.println(stu.getName()+" "+stu.getAge());
        stu.show();
    }
}
