package com.heima.day02.StringBuilder;

/**
 * StringBuilder()
 * 构造一个字符串构建器，其中不包含任何字符，初始容量为16个字符。
 * StringBuilder​(String str)
 * 构造一个初始化为指定字符串内容的字符串构建器。
 */
public class StringDemo1 {
    public static void main(String[] args) {
        StringBuilder str =  new StringBuilder();
        System.out.println(str);
        System.out.println(str.length());
        StringBuilder str1 = new StringBuilder("ABC");
        System.out.println(str1);
        System.out.println(str1.length());

    }
}
