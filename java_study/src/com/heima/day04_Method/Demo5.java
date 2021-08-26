package com.heima.day04_Method;

public class Demo5 {
    public static void main(String[] args) {
        int max  = get_max(10,20);
        System.out.println(max);
    }

    public static int  get_max(int num1,int num2) {
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
}
