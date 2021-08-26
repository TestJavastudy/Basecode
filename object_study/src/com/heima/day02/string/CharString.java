package com.heima.day02.string;

public class CharString {
    /**
     * 将字符串拆分成单个字符并在控制台输出
     * 1、public char charAt​(int index)
     * 返回指定索引处的char值。 指数范围为0至length() - 1 。
     * 2 public char[] toCharArray()
     *将此字符串转换为新的字符数组。
     */
    public static void main(String[] args) {
        String s1 = "我爱中国";
        for (int i = 0; i < s1.length() ; i++) {
            System.out.println(s1.charAt(i));
        }
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
