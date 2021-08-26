package com.heima.day02.string;

public class CharStringTest {
    public static void main(String[] args) {
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount =0;
        String s = new String("ABCDqwed1234556中国人喜欢中古");
        //char[] ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                bigCount ++;
            }else if (ch >='0'&&ch<='9'){
                numCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("大写字母："+bigCount);
        System.out.println("小写字母："+smallCount);
        System.out.println("数字："+numCount);
        System.out.println("其他字母："+otherCount);
    }
}
