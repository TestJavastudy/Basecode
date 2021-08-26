package com.heima.day06test;

import java.util.Scanner;

public class Demo01 {
    /**
     * 通过键盘录入的方式输入星期数(1-7的整数)，显示今天的减肥活动，使用switch和if两种判断语句分别完成。
     * ​            周一：跑步
     * ​            周二：游泳
     * ​            周三：慢走
     * ​            周四：动感单车
     * ​            周五：拳击
     * ​            周六：爬山
     * ​            周日：好好吃一顿
     */
    public static void main(String[] args) {
        System.out.println("输入星期数(1-7的整数)");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 1) {
            System.out.println("周一：跑步");
        } else if (type == 2) {
            System.out.println("周二：游泳");
        } else if (type == 3) {
            System.out.println("周三：慢走");
        } else if (type == 4) {
            System.out.println("周四：动感单车");
        } else if (type == 5) {
            System.out.println("周五：拳击");
        } else if (type == 6) {
            System.out.println("周一：爬山");
        } else if (type == 7) {
            System.out.println("周日：好好吃一顿");
        }else {
            System.out.println("您输入有误");
        }
        switch (type){
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三：慢走");
                break;
            case 4:
                System.out.println("周四：动感单车");
                break;
            case 5:
                System.out.println("周五：拳击");break;
            case 6:
                System.out.println("周一：爬山");break;
            case 7:
                System.out.println("周日：好好吃一顿");break;
            default:
                System.out.println("您输入有误");
                break;

        }
    }
}
