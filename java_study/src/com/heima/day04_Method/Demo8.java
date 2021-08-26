package com.heima.day04_Method;

public class Demo8 {
    /**
     * 调用方法传递参数时，传的是实际的数值
     * 在方法执行完成后数据值就被弹出栈内存
     */
    public static void main(String[] args) {
        int num  = 100;
        System.out.println("调用change前："+num);
        change(num);
        System.out.println("调用change后："+num);
    }

    public static void change(int m) {
        m = 200;
    }

}
