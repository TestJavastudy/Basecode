package com.heima.day02;
import java.util.Scanner;
import java.util.Random;
public class Demo4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int guess = rd.nextInt(200);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜的数据：");
            int guess_num = sc.nextInt();
            if (guess_num == guess){
                System.out.println("恭喜你猜对了");
                break;
            } else if (guess_num > guess){
                System.out.println("恭喜你猜大了");
            }else {
                System.out.println("恭喜你猜小了");
            }
        }
    }

}
