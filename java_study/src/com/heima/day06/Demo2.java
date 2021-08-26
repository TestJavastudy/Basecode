package com.heima.day06;

public class Demo2 {
    /**
     * 数据值的交换
     */
    public static void main(String[] args) {
        change(2,3);
    }
    public  static  void change(int a,int b){
        int temp = a;
        a = b;
        b =temp;
        System.out.println("a的值为："+a+" b的值为："+b);

    }
}
