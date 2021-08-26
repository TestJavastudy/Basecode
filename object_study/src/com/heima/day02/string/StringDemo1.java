package com.heima.day02.string;

public class StringDemo1 {
    /**
     * 字符串常见的构造方法
     * 1、public String(){}创建了一个空白值的字符串
     * 2、public String(char[] ch){} 将单个字符组成的字符数组合并成字符串
     * 3、public String(String str){} 根据传入的字符串来显示字符串
     * String S="123";赋值方式创建字符串
     * 注意：
     * 字符串类是个特殊的类，所以在使用构造方式创建字符串时，直接输出字符串对象不是地址
     *
     */
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);
        String s2 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s2);
        String s3 = new String("STRING");
        System.out.println(s3);
        String s4 = "SR";
        System.out.println(s4);
    }

}
