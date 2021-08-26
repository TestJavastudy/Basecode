package com.heima.day06;

import java.util.Scanner;

public class PwdDemo {
    /**
     * 需求：
     * 1、判断密码是否正确，密码是123
     * 2、若密码错误，用户有3次输入机会
     *
     */
    public static void main(String[] args) {
        int count  = 0;
        /**
         * while 死循环的退出方式有两种
         * 1、使用break
         * 2 声明一个boolean flag = true;的变量
         * while(flag){
         *     flag =false;
         * }
         */
        boolean flag = true;
        while (true){
            //提示用户输入密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入密码：");
            int pwd =sc.nextInt();
            //判断用户输入密码是否正确
            if (pwd == 123){
                System.out.println("密码正确，欢迎回来——");
                break;
            }else {
                //记录用户输错次数
                count++;
                //若用户输入密码错误次数大于3次，提示用户不能继续从事
                if (count == 3){
                    System.out.println("你输入的密码已达到上线，请2个小时候尝试");
                    break;
                }else{
                    System.out.println("密码输入错误，你还有"+(3 -count)+"次机会尝试");
                }




            }
        }
    }
}
