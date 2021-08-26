package com.heima.day02;

public class Demo6 {
    public static void main(String[] args) {
        double paper = 0.1;
        double zhufeng =888640;
        int count = 0;
        while (true){
            paper*=2;
            count++;
            if (paper>=zhufeng){
                break;
            }
        }
        System.out.println(count);

    }
}
