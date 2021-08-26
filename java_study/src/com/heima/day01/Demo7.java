package com.heima.day01;

public class Demo7 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println((a > b) & (b < c));//无论左边真假，右边都要执行。
        System.out.println((a > b) | (b < c));
        System.out.println((a < b) ^ (b < c));
        System.out.println(!(a > b) & (b < c));
        System.out.println((a < b) && (b > c));//&&短路运算符--如果左边为真，右边执行；如果左边为假，右边不执行。

    }
}
