package com.heima.day03;
import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args) {
        int [] arr = {19,12,15,13,4,7};
        int index = -1;
        System.out.println("请输入需要查找的数据：");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if (guess == arr[i]){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("数组中元素不存在");
        }else{
            System.out.println(index);
        }
    }
}
