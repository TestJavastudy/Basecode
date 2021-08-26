package com.heima.day06test;

import java.util.Scanner;

public class Demo9 {
    /**
     * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
     * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数");
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 100) {
                System.out.println("您的输入有误，请重新输入");
                i--;
            }
        }
        int[] brr = maxAndmin(arr);

        int avg = (int)(brr[2]-brr[1]-brr[0])/4;
        System.out.println(avg);
    }

    public static int[] maxAndmin(int[] arr) {
        int[] brr = new int[3];
        brr[0] = arr[0];//max
        brr[1] = arr[0];//min
        brr[2] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (brr[0] < arr[i]){
                brr[0] = arr[i];
            }
            if (brr[1]>arr[i]){
                brr[1] = brr[i];
            }
            brr[2] += arr[i];
        }
        return brr;
    }
}
