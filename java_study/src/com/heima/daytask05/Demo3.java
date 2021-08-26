package com.heima.daytask05;

import java.util.Scanner;

public class Demo3 {
    /**
     * 通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号
     */
    public static void main(String[] args) {
        System.out.println("请输入行数n的值：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("请输入列数m的值：");
        int m = sc.nextInt();
        print(n,m);
    }
    public static void print(int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
