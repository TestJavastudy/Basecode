package com.heima.day04_Method;

public class Demo3 {
    public static void main(String[] args) {
        method(10,20);
    }
    public static void method(int m,int n){
        System.out.print(m+"-"+n+"之间的偶数是：");
        for (int i = m; i < n; i++) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
