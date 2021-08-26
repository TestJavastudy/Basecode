package com.heima.daytask05;

public class Demo1 {
    /**
     * 定义一个方法，该方法能够找出两个小数中的较小值并返回
     */
    public static void main(String[] args) {
        double a = 3.14,b=2.34;
         double min = getMin(a, b);
        System.out.println(min);

    }

    private static double getMin(double a, double b) {
        double min = a;
        if(min > b ){
            min = b;
        }
        return min;
    }
}
