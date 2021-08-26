package com.heima.test03;

public class Test07 {
    public static void main(String[] args) {
            print(4);
    }
    public static  void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" * "+i+" = "+(i*j));
                if(i != j){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
