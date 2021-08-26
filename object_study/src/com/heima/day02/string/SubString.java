package com.heima.day02.string;

import java.util.Random;
import java.util.Scanner;

/**
 * 切分字符串
 * public String substring​(int beginIndex)
 * 返回一个字符串，该字符串是此字符串的子字符串。
 * 子字符串以指定索引处的字符开头，并延伸到此字符串的末尾。
 * public String substring​(int beginIndex, int endIndex)
 * 返回一个字符串，该字符串是此字符串的子字符串。 子字符串从指定的beginIndex开始，
 * 并扩展到索引endIndex - 1处的字符。 因此子串的长度是endIndex-beginIndex 。
 */
public class SubString {
    /**
     * 给手机号加密
     * 0-9 的ASCII是48-57
     */
    public static void main(String[] args) {
        //生成虚拟号后4位
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        char [] ch = new char[4];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (rd.nextInt(9)+48);
        }
        String end_phone = "_"+new String(ch);
        //System.out.println(end_phone);
        /**
         * 2、将顾客的手机中间4位数隐藏
         * 1)输入手机号
         */
        //1 获取顾客手机号
        System.out.println("请输入一个顾客的手机号码：");
        String phone = sc.nextLine();
        //2截取顾客手机号字符串
        String begin_phone = phone.substring(0,3);
        String end_phone_customer = phone.substring(7);
        //3 拼接字符串
        String new_phone = begin_phone+"****"+end_phone_customer+end_phone;
        System.out.println(new_phone);


    }
}
