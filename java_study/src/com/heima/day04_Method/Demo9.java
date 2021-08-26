package com.heima.day04_Method;

public class Demo9 {
    /**
     * 方法中的传入的参数传递的是引用数据类型时，传递的是地址值
     * 引用数据类型：[]、String、interface(接口)
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {11,12,3,4};
        System.out.println("调用change前："+arr[1]);
        change(arr);
        System.out.println("调用change后："+arr[1]);


    }
    public static void  change(int [] arr){
        arr[1] = 200;
    }

}
