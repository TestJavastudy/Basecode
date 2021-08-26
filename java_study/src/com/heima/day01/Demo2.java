package com.heima.day01;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 3, 44, 55, 66, 7};
        int[] maxAndmin = get_maxAndmin(arr);
        System.out.println("最大值是：" + maxAndmin[0]);
        System.out.println("最小值是：" + maxAndmin[1]);
    }

    public static int[] get_maxAndmin(int[] arry) {
        int max = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (max < arry[i]) {
                max = arry[i];
            }
        }
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (min > arry[i]) {
                min = arry[i];
            }
        }
        int[] maxAndmin = {min, max};
        return maxAndmin;
    }
}
