package com.heima.day01.Demo5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米",1999.9,"black");
        p1.call();
        p1.setPrice(2000.1);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入颜色：");
        String color =sc.nextLine();
        p1.setColor(color);
        p1.sendMessage();
    }
}
