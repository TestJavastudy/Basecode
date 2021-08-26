package com.heima.day05;

public class Demo1 {
    /**
     * 遍历数组方法
     */
    public static void main(String[] args) {
        int [] arr = {11,12,13,14,15,16};
        method(arr);
        int max = getMax(arr);
        System.out.println("最大值是"+max);
    }
    public static void method(int [] arr){
        System.out.print("数组中的元素值是：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.println(arr[arr.length-1]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
    public static int getMax(int[] arr){
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
