package com.heima.day05;

public class Demo2 {
    public static void main(String[] args) {
        int []arr = {11,12,13,14,15,16,17};
        int []arr1 = method(arr);
        System.out.println("最大值是："+arr1[0]+" "+"最小值是："+arr1[1]);
    }
    public static  int[] method(int[]arr ){
        int min,max;
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        int [] arr1 = {max,min};
        return  arr1;
    }
}
