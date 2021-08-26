package com.heima.day02;

public class Demo3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=100;i<1000;i++){
            int ge,shi,bai;
            ge = i%10;
            shi =i/10%10;
            bai=i/100%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.print(i+"是水仙花数");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                }else {
                    System.out.print(" ");
                }
            }

        }
    }
}
