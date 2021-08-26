package com.heima.day02.string;

/**
 *比较字符串值
 * equals​(Object anObject)，返回值boolean,将此字符串与指定的对象进行比较。
 * equalsIgnoreCase​(String anotherString)返回值boolean,将此字符串与指定的对象进行比较
 * 忽略大小写
 * length()返回此字符串的长度。
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 ="ABCd";
        String s3 ="abcd";
        int s1_length = s1.length();
        System.out.println(s1_length);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
