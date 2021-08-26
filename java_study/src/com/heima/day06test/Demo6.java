package com.heima.day06test;

public class Demo6 {
    public static void main(String[] args) {
        /**
         * 设计一个方法，用于比较两个数组的内容是否相同
         */
        int[] arr = {1, 2, 3};
        int[] brr = {1, 3,2};
         boolean result =method(arr, brr);
         if (result){
             System.out.println("两个数组一致");
         }else {
             System.out.println("两个数组不一致");
         }
    }

    private static boolean method(int[] arr, int[] brr) {
        boolean result = true;
        if (arr.length == brr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != brr[i]) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
