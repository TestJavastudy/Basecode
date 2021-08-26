package com.heima.day03.demoTest;

import com.heima.day03.domain.Student;

import java.util.ArrayList;

public class AddAndGetList {
    /**
     * 创建一个存储学生对象""的集合，
     * 存储3个学生对象，使用程序实现在控制台遍历该集合
     */
    public static void main(String[] args) {
        Student stu1 = new Student("1123","张珊",18);
        Student stu2 = new Student("1125","李四",18);
        Student stu3 = new Student("1124","王五",18);
        ArrayList <Student> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu.getSno()+"\t"+stu.getName()+"\t"+stu.getAge());
        }
    }



}
