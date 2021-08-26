package com.heima.day02.string;

public class StringDemo3 {
    /**
     * + 字符串拼接符
     * 当 + 两端是拼接的字符串常量时，获取的结果和完全定义的字符串地址一致
     * 当时变量时，java会自动创建一个StringBuilder对象
     * 调用其中的append()方法拼接字符串，在调用toString方法将拼接后的数组转换成String
     */
    public static void main(String[] args) {
        String s = "abc";
        String s2 ="ab";
        String s1 =s2+"c";
        System.out.println(s == s1);//false
    }
}
