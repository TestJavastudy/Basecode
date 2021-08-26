package com.heima.day06;

public class Demo03 {
    /**
     * 使用^ 异或运算符完成两个数据的交换
     * 数字本身 ^ 数字本身得出的结果还是数据本身
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        System.out.println(a);
        b = a ^ b ;//运行的是a ^ b ^ b ;结果是a
        System.out.println(b);
        a = a ^ b;//运行的是 a ^ b ^ a;结果为b
        System.out.println(a);

    }
}
