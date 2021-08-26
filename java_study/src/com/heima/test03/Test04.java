package com.heima.test03;

import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Random rm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("求和值为："+sum);
    }
}
