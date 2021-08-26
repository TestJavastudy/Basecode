package com.heima.day06test;

public class Demo4 {
    /**
     *    我国古代数学家张丘建在《算经》一书中提出的数学问题：
     *    鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
     * ​    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20 ; i++) {
            for (int j = 0; j < 33 ; j++) {
             if(5*i+3*j+(100-i-j)/3 == 100 && (100-i-j)%3 == 0){
                 System.out.println(i+"*******"+j+"*******"+(100-i-j));
             }
            }
        }
    }

}
