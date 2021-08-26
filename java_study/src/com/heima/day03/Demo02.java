package com.heima.day03;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 33 ; j++) {
                int n = 100 - i - j;
                if (5 * i + 3 * j + (n / 3) == 100 && n % 3 == 0) {
                    System.out.println("鸡公：" + i);
                    System.out.println("鸡母：" + j);
                    System.out.println("鸡崽子：" + n * 3);
                }
            }
        }
    }
}
