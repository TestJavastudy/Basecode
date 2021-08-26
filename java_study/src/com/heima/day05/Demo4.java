package com.heima.day05;

public class Demo4 {
    public static void main(String[] args) {
        /**
         * 0b代表二进制
         * 0 代表八进制
         * 0x 代表16进制
         */

        System.out.println(0b10);
        System.out.println(0710);
        System.out.println(0x10);
        System.out.println(1%5);
        for(int i=1;i<=10;i++){
            if(i%5==0){
                System.out.println("hello");
                break;
            }
        }
    }
}
