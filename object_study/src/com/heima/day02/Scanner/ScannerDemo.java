package com.heima.day02.Scanner;

import java.util.Scanner;

/**
 * 键盘录入
 * sc.next(); 遇见空格 或 tab键后就停止数据读入
 * sc.nextLine();换行时不读取数据
 * 遇见需要录入整数和字符串时，使用sc.nextInt()+sc.next();因为使用sc.nextLine()
 * 时会自动读取到输入整数的空格，导致无法录入字符串
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
