package com.heima.day01.Demo2;

/**
 * private 修饰的变量和方法名只能在内中调用
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120){
            this.age =age;
        }
        else {
            System.out.println("你输入的年龄不合法");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void  show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }
}
