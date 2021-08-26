package com.heima.day02.string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringDemo2 {
    /**
     * java中，使用
     * String s = "abc";
     * 创建的字符串存储在字符串常量池中，7版本之前放在方法区，7版本后再堆内存，且在常量池中存在的
     * 字符串常量不重复创建
     * 使用String的构造方法创造的字符串存储在堆内存中
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//地址值一致
        char []ch  = {'a','b','e'};
        String S3 = new String(ch);
        String S4 = new String(ch);
        System.out.println(S3 == S4);//地址值不一致


    }
}
