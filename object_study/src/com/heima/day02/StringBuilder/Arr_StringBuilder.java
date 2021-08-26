package com.heima.day02.StringBuilder;

public class Arr_StringBuilder {
    public static void main(String[] args) {
        /**
         * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
         * 并在控制台输出结果。例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
         */
        int[] arr = {1, 2, 3};
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                str.append(arr[i]).append("]");
            } else {
                str.append(arr[i]).append(",");
            }
        }
        String str1 = str.toString();
        System.out.println(str1);
    }
}
