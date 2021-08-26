package com.heima.test;

public class reverseString {
    /**
     * 定义一个字符串数组，并实现字符翻转
     */
    public static void main(String[] args) {
        //定义
        String[] str ={"java","我的","您的"};
        str = reverseString(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    private static  String[] reverseString(String[] str) {
        String[] strNew = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str[i]);
            sb.reverse();
            strNew[i] = sb.toString();
        }
        return strNew;
    }
}
