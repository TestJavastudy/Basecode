package com.heima.test;

public class Bsort {
    public static void main(String[] args) {
        int [] a = {22,12,14,24,1,0,8,7,8,9};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]<a[j]){
                int temp = a[i];
                a[i] =a[j];
                a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }


}
