package com.heima.test03;

public class test03 {
    public static void main(String[] args) {
        //和值
        int sum = 0;
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //求平均值
        int avg = sum / arr.length;
        System.out.println("学生的平均值是:" + avg);
    }
}
