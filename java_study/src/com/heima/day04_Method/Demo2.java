package com.heima.day04_Method;

public class Demo2 {
    //编造方法判定奇偶数
    public static void main(String[] args) {
        //定义一个数组
        int num = 11;
        boolean type = method(num);
        if (type == true){
            System.out.println("是偶数");
        }else if(type == false) {
            System.out.println("是奇数");
        }
    }
    public static boolean method(int i){
        if (i % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
