package com.heima.day02.string;

import java.util.Scanner;

public class ReplaceString {
    /**
     * public String replace​(CharSequence target, CharSequence replacement)
     * 将此字符串中与文字目标序列匹配的每个子字符串替换为指定的文字替换序列。
     */
    public static void main(String[] args) {
        String s = "你真TMD是一个人才呀";
        String s1 = s.replace("TDM","***");
        String s2 = s.replace("TM","RD");
        System.out.println(s1);
        System.out.println(s2);
    }

}
