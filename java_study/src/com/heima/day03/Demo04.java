package com.heima.day03;

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 第一个for循环控制行
         * 第二个for循环控制列
         */
        for (int row = 0; row <= 3 ; row++) {
            for (int j = 1; j <= row ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 3 ; i++) {
            for (int j = 3; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
