package com.heima.day02.StringBuilder;

public class Reverse_StringBuilder {
    /**
     * 对比一个字符串是否是对称字符串
     */
    public static void main(String[] args) {
        String str = "123321";
        StringBuilder str1 = new StringBuilder(str);
        //翻转字符串
        str1.reverse();
        //将str1转换成String变量
        if (str.equals(str1.toString())){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
