package com.heima.test03;

public class Test06 {
    public static void main(String[] args) {
        /**
         * 通过键盘录入两个整数n和m。n代表行数，m代表列数。
         * 定义一个方法，方法的功能是打印n行m列的@符号
         */
        print(4,5);
    }
    public static void print(int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0;  j < m; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
