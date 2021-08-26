package com.heima.daytask05;

import java.util.Scanner;

public class Demo6 {
    /**
     * 请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
     * 四舍五入之后的结果是一个int整数类型并返回
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小时");
        double n = sc.nextDouble();
        int result = method(n);
        System.out.println(result);
    }
    public static int method(double n){
        int xiaoshu =(int) (n*10%10);
        if (xiaoshu < 5){
            return (int)n;
        }else {
            return (int)n+1;
        }

    }
}


