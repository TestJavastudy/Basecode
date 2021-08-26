package com.heima.day06;

public class Demo1 {
    public static void main(String[] args) {
        /**
         * 位运算（0代表false 1代表true）非boolean类型的数据运算是按照位运算
         * & 位运算与 遇见FALSE
         * | 位运算或，遇见TRUE就是TRUE
         * ^ 异或。同为false.不同为TRUE
         * ~ 为运算非，取反
         */
        System.out.println(2&2);//0010
        System.out.println(2|2);//0010
        System.out.println(2^2);//0000
        System.out.println(~2);//1101(补码)--反码（1101-1=1100）--原码 （0011）
        /**
         * <<  有符号左运算符  向左移动几位就是*2的几次幂
         * >> 有符号右运算符  向右移动几位就是\2的几次幂
         * >>> 无符号右移，无论符号位是0还是1，都是补0；
         */
        System.out.println(2<<1);//0010->0100
        System.out.println(2>>1);//0010->0001
        System.out.println(-2>>>1);//1000-0010->0100->0001

    }
}
