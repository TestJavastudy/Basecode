package com.heima.day02.string;

/**
 *JAVA中“ abc123”,双引号内的内容都是字符串，属于String这个类的对象
 * 字符串是常量，创建后无法更改内容，只可以全部替换
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s);
        s = "中国";//完全替换
        System.out.println(s);
    }
}
