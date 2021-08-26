package com.heima.day01;
import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的分数：");
        double score = sc.nextDouble();
        int type = 0;
        if (score >= 90 && score <= 100) {
            type = 1;
        } else if (score >= 80 && score < 90) {
            type = 2;
        }
        else if (score >= 70 && score < 80) {
            type = 3;
        }
        else if (score >= 60 && score < 70) {
            type = 4;
        }
        else if (score >= 0 && score < 60) {
            type = 5;
        }else {
            type = 6;
            System.out.println("你输入的分数有误");
        }
        switch (type){
            case 1:
                System.out.println("奖励自行车一辆");
                break;
            case 2:
                System.out.println("奖励网球拍");
                break;
            case 3:
                System.out.println("语言鼓励你");
                break;
            case 4:
                System.out.println("不挨打");
                break;
            case 5:
                System.out.println("你需要更好的学习");
                break;
            default:
                System.out.println("输入分数有误");

        }

    }
}
