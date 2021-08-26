package com.heima.day03;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        System.out.println("请输入今天是周几：");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("跑步");
            case 2:
                System.out.println("拳击");
            case 3:
                System.out.println("跆拳道");
            case 4:
                System.out.println("跑步");
            case 5:
                System.out.println("摔跤");
            case 6:
                System.out.println("陪伴家人");
            case 7:
                System.out.println("打架");
            default:
                System.out.println("烦死了");
        }
    }
}
