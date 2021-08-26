package com.heima.day06test;

public class Demo3 {
    /**
     * 有一个很有名的数学逻辑题叫做不死神兔问题。有一对兔子，
     * 从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
     * 假如兔子都不死，问第二十个月的兔子对数为多少？      6765
     */
    public static void main(String[] args) {
        int[] arr = new int[21];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[19]);
    }

}
