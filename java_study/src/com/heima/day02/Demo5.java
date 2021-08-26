package com.heima.day02;

public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 24; i++) {
            if (i == 1||i ==2||i==3||i==4){
                continue;
            }
            System.out.println("电梯到第"+i+"层");
        }
    }
}
