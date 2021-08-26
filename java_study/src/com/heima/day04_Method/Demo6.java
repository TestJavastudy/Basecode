package com.heima.day04_Method;

public class Demo6 {
    public static void main(String[] args) {
        int result = get_min(10,11);
        System.out.println(result);
    }
    public static int get_min(int m,int n){
        if (m > n) {
            return n;
        }else {return m;}
    }
}
