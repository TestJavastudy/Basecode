package com.heima.day02;

public class Demo2 {
    public static void main(String[] argsf) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
