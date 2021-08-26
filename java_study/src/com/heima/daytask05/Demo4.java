package com.heima.daytask05;

import java.util.Scanner;

public class Demo4 {
    /**
     * 我们知道数学中有九九乘法表。
     * 请定义一个方法，方法的功能是打印nn乘法表。在主方法中键盘录入取值范围为[1-9]的变量n
     */
    public static void main(String[] args) {
        System.out.println("键盘录入取值范围为[1-9]的变量n");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j){
                    System.out.print(j+"*"+i+" = "+i*j);
                }else {
                    System.out.print(j+"*"+i+" = "+i*j+" ");
                }

            }
            System.out.println();
        }
    }
}
