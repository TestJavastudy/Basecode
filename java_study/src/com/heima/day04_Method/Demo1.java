package com.heima.day04_Method;

public class Demo1 {
    /**
     * 定义主方法
     * 方法格式
     * public static void 方法名{
     *     方法体
     * }
     * @param args
     */
    public static void main(String[] args) {
        eat();
        study();
    }
    public static void eat(){
        System.out.println("需要吃饭");
    }
    public static void study(){
        eat();
        System.out.println("需要学习");
    }

}
