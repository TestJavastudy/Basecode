package com.heima.day06;

public class Demo7 {
    public static void main(String[] args) {
        /**
         * 二维数组遍历
         */
        //定义一个二位数组
        int [][]arr = {{1,2,3},{2,3}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
