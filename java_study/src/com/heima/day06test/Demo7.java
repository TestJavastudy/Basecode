package com.heima.day06test;

import java.util.Scanner;

public class Demo7 {
    /**
     * 已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。
     * 定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
     */
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个数据");
        int findnum = sc.nextInt();
        int result = find(arr,findnum);
        if (result == -1){
            System.out.println("没有找到");
        }else {
            System.out.println("index:"+result);
        }
    }

    public static int find(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                break;
            }
        }
        return index;

    }
}
