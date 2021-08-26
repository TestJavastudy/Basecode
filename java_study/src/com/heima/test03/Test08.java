package com.heima.test03;

public class Test08 {
    public static void main(String[] args) {

       double a = method(-3.14);
        System.out.println(a);
    }

    /**
     * 数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
     * 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
     * @param a
     *
     */

    public static double method( double a) {
       if (a > 0){
           return a;
       }else if (a < 0){
           return -a;
       }else {
           return 0;
       }


    }
}
