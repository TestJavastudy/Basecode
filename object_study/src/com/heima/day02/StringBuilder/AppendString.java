package com.heima.day02.StringBuilder;

public class AppendString {
    /**
     * append(任意类型);字符串拼接
     * append(String str ,int begin,int end)
     * 将需要拼接的字符串的第begin个字符到第end个字符进行拼接
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("OB");
        str.append(12).append('c').append(true).append("ABC",1,3);
        System.out.println(str);
        str.reverse();
        System.out.println("翻转字符串后："+str);
        System.out.println(str.length());
        System.out.println(str.toString());//将StringBuilder转换成String类型数据
    }
}
