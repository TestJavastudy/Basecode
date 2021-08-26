package com.heima.test03;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(6)+55;
        int []arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(8)+13;
        }
        System.out.println(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
