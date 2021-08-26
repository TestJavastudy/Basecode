package com.heima.day04_Method;

public class Demo7 {
    /**
     * 方法重载
     * 在同一个类中，方法的参数个数、参数的数据类型、顺序不同时构成方法重载，顺序不同不建议使用
     *
     */
    public static void main(String[] args) {
        Boolean result = compare(2L,3L);
        System.out.println(result);
    }
    public static boolean compare(int a,int b){
        return a==b;

    }public static boolean compare(short a,short b){
        return a==b;

    }public static boolean compare(long  a,long b){
        return a==b;

    }public static boolean compare(byte a,byte b){
        return a==b;

    }
}
