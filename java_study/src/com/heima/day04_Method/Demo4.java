package com.heima.day04_Method;

public class Demo4 {
    public static void main(String[] args) {
        int add_num = add(10,20);
        System.out.println(add(add_num,add_num));
    }
    public static int add(int m,int n){
        return  m+n;
    }
}
