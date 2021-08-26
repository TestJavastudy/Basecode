package com.heima.day06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Demo5<arr> {
    /**
     * 数据类型 [][]数组名称 = new 数据类型[][];
     * int [][] arr=new  int[n][m];
     * arr[n]存储的的是arr[n][m]数组的地址值
     */
    public static void main(String[] args) {
        //声明一个二位数组，二位数组的动态初始化，只创建了一个二位数组，并分配了地址
        int [][] arr= new int[3][3];
        //二维数组的静态初始化
        /**
         * 二维数组中存储的一维数组大小无限制，可以数组元素个数不同
         * int [][] brr = new int[][]{{1,2},{1,2,3}};完整写法
         *  int [][] brr = {{1,2},{1,2,3}};  //简化写法
         */
        int [][] brr = {{1,2},{1,2,3}};

        System.out.println(brr[1][2]);

        /**
         *[[I@154617c
         * [[ 二位数组
         */
        System.out.println(arr);
        /**
         * 二位数组存的是一维数组的地址值
         * [I@154617c
         * [ 代表是一维数组
         * @分隔符
         * 154617c地址值
         */
        System.out.println(arr[0]);
    }
}
