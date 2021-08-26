package com.heima.daytask05;

import java.util.Scanner;

public class Demo5 {
    /**
     * 在主方法中通过键盘录入三个整数。
     * 定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数:");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个数:");
        int num3 = sc.nextInt();
        print(num1,num2,num3);
    }
    public static void print(int n1,int n2,int n3){
        int min,max;
        if (n1 < n2 && n1 < n3) {
            min = n1;
        } else if (n2 < n1 && n2 < n3) {
            min = n2;
        } else {
            min = n3;
        }
        if (n1 > n2 && n1 > n3) {
            max = n1;
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
        } else {
            max = n3;
        }
        int mid = n1+n2+n3-min-max;
        System.out.println("从大到小排序是："+max+","+mid+","+min);
    }
}
