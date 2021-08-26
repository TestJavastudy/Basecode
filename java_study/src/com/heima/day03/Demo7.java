package com.heima.day03;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        //1、数组的遍历,定义一个数组
        int[] arr = new int[6];
                //键盘录入数组元素
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < arr.length; i++) {
                    //2 限制数组元素的值在1-200之间
                    System.out.println("请输入第"+(i+1)+"个数值元素");
                    int score = sc.nextInt();
                    if (score >= 0&& score <= 200){
                        arr[i]=score;
                    }else {
                        System.out.println("您的输入有误，请重新输入：");
                        i--;
                    }
        }
                //遍历数组
        System.out.print("录入的数组数字是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //数组求和
        int sum =  0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //数组最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //数组最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        //平均值
        int avg =  (sum - min- max)/4;
        System.out.println("平均值是："+avg);
        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);

    }
}
