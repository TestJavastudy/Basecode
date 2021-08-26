package com.heima.daytask05;

public class Demo2 {
    /**
     * 定义一个方法，该方法能够找出三个整数中的最小值并返回
     */
    public static void main(String[] args) {
        int a =1,b=2,c=3;
        int result = getMin(a,b,c);
        System.out.println(result);

    }
    public static int getMin(int a,int b,int c){
        if (a < b && a < c){
            return a;
        }else if (b < a && b < c){
            return b;
        }else {
            return c;
        }
    }
}
