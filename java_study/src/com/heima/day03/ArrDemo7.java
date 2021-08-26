package com.heima.day03;

import java.util.Scanner;

public class ArrDemo7 {
    public static void main(String[] args) {
        //定义一个评分数组
        int [] arr = new int[6];
        //定义最大值和最小值
        int max ,min;
        int sum =0;
        //键盘输入评委评分
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            System.out.println("请输入第"+(i+1)+"个评委的分数");
            int score = sc.nextInt();
            //判断分数的合法性
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            }else {
                System.out.println("您输入的分数有误，请重新输入一个1-100之间的数");
                i--;
            }

        }
        max = arr[0];
        min = arr[0];
        //求最大值并求和
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            if (max < arr[i]){
                max =arr[i];
            }
        }
        //求最小值
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                max =arr[i];
            }
        }
        double avg = (sum - max - min)/4;
        System.out.println("选手最后得分为："+avg);
    }
}
