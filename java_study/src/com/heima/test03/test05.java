package com.heima.test03;

public class test05 {
    /**
     * 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
     * @param args
     */
    public static void main(String[] args) {
        double a = 1.39;
        double b = 2.1;
        double n =0.98;
        double c = getMin(a, b);
        System.out.println(c);
        double d = getMin(a,b,n);
        System.out.println(d);
    }
    public static  double getMin(double a ,double b){
        if (a>b){
            return b;
        }else {
            return a;
        }
    }
    /**
     * 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行
     */
    public static  double getMin(double a ,double b,double c){
        if (a < b && a < c ){
            return c;
        }else if (b < a && b<c){
            return b;
        }else {
            return c;
        }
    }


}
