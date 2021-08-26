package com.heima.test.domain;

public class sumDemo {
    /**
     * 两个数的和等于固定数值，并返回数组值下标
     * @param args
     */
    public static void main(String[] args) {
        int[] a ={2,3,6,9};
        int target = 11;
       lo: for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j] == target){
                    System.out.println(i+"..."+j);
                    break lo;
                }
            }
        }
    }
}
