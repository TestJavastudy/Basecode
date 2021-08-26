package com.heima.test03;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        int type;
        System.out.println("请选择运算方式，(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)");
        Scanner sc = new Scanner(System.in);
        type = sc.nextInt();
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        switch (type){
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("您输入的方式有误，请重新输入");
                break;

        }

    }
}
