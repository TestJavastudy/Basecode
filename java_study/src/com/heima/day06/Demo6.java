package com.heima.day06;

public class Demo6 {
    public static void main(String[] args) {
        /**
         * 二维数组的遍历
         */
        int [][] brr = {{1,2},{1,2,3}};
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                System.out.println(brr[i][j]);
            }
        }
    }
}
