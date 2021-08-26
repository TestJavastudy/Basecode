package com.heima.day05;

public class Demo3Debug {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10 ; i++) {
            if (i > 5 && i < 8 ){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
