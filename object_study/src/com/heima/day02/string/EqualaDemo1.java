package com.heima.day02.string;

import java.util.Scanner;

public class EqualaDemo1 {
    public static void main(String[] args) {
        EqualsMethod s1 = new EqualsMethod("Admin","w123456");
        boolean flag;
        Scanner sc = new Scanner(System.in);
        //顾客输入账号或密码次数草果五次需要提示顾客两个小时候在测试
        //int count = 0;
        for (int i = 1; i < 5 ; i++) {
            System.out.println("请输入你的账号:");
            String userName =sc.nextLine();
            System.out.println("请输入你的密码:");
            String pwd =sc.nextLine();
            flag = s1.compare(userName,pwd);
            if (flag){
                System.out.println("您输入的信息输入正确，欢迎回来~");
                break;
            }else {
                if (i == 5){
                    System.out.println("你的机会已经耗尽，请2个小时候在尝试");
                }else {
                System.out.println("您输入的账号或密码有误，您还有"+(5-i)+"次机会"+"请核对后重新输入！");
                //count ++;
                    }

            }
        }
        /**
         * if (count == 5){
         *             System.out.println("你的机会已经耗尽，请2个小时候在尝试");
         *         }
         */
    }
}
