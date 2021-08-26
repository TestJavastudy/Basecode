package com.heima.day02.string;

public class SplitDemo {
    /**
     * public String[] split​(String regex)
     * @reget 代表固定的字符串
     */
    public static void main(String[] args) {
        String  s  = "张珊,李四,王五";
        String []str = s.split(",",2);
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
    }
}
