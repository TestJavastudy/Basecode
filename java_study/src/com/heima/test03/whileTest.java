package com.heima.test03;

public class whileTest {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.01;
        while (paper <= 88888890) {
            paper *= 2;
            System.out.println(paper);
            count++;
        }
        System.out.println(count);
    }
}
