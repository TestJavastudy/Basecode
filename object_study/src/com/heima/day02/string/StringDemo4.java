package com.heima.day02.string;

public class StringDemo4 {
    /**
     * java的常量优化机制，字符串拼接时，如果是常量拼接，拼接后的结果和完整的字符串指向的同一个
     * 常量池地址
     * @param args
     */
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "a"+"b"+"c";
        System.out.println(s1 == s);
        String s2 = 'a'+"b"+"c";
        System.out.println(s2 == s);
    }
}
