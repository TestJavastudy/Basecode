package com.heima.day01.Demo4;

public class Student {
    private String name;
    private  int age;
    private String academy;

    public Student() {
        System.out.println("我是无参数构造方法");
    }

    public Student(String name, int age, String academy) {
        this.name = name;
        if (age >= 0 && age <= 120){
            this.age = age;
        }else if (age>=121 && age<=200){
            this.age = age;
            System.out.println("长寿的人");
        }else {
            System.out.println("年龄不合法");
        }
        this.academy = academy;
        System.out.println("我是有参数构造方法");
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
        if (age >= 0 && age <= 120){
            this.age = age;
        }else if (age>=121 && age<=200){
            this.age = age;
            System.out.println("长寿的人");
        }else {
            System.out.println("年龄不合法");
        }

    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }
    public void  show(){
        System.out.println("姓名："+ this.name);
        System.out.println("年龄："+ this.age);
        System.out.println("院校："+ this.academy);

    }
}
