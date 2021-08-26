package com.heima.day06;

import java.util.Scanner;

public class Demo8 {
    /**
     * 多重循环时，可以使用标号功能跳转到指定循环
     * 标号名：while（TRUE）{
     *     switch(type){
     *         case 1:
     *          break 标号名；
     *          case 2：
     *          break
     *     }
     * }
     */
    public static void main(String[] args) {
        lo:for (;;) {
            System.out.println("这是for循环");
            while(true){
                System.out.println("这是while循环");
                System.out.println("请输入0结束while循环,输入1结束for循环");
                Scanner sc = new Scanner(System.in);
                int week = sc.nextInt();
                if (week == 0){
                    break ;
                }else {
                    break lo;
                }
            }
        }
    }
}
