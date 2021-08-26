package com.heima.day03;

public class ArrDemo6 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 15;
        arr[1] = 16;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("************************");
        int [] arr_1=arr;
        arr_1[0] =44;
        System.out.println("************************");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("************************");
        System.out.println(arr_1[0]);
        System.out.println(arr_1[1]);

    }
}
