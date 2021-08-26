package com.heima.test03;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        int [] arr = {12,14,23,45,66,68,70,77,90,91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        //创建一个新数组
        int [] arr1 = new int[arr.length+1];
        //给新数组赋值
        for (int i = 0; i < arr.length; i++) {
            if ( num > arr[i]){
                arr1[i] = arr[i];
                arr1[i+1] = num;
            }else {
                arr1[i+1] = arr[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (i ==  arr1.length-1){
                System.out.println(arr1[i]);
            }else {
            System.out.print(arr1[i]+" ");}
        }
    }
}
