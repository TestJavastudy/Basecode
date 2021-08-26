package com.heima.day03.demoTest;

import java.util.ArrayList;

public class ArralistDemo2 {
    /**
     * public boolean remove(Object o) 删除指定的元素，返回删除是否成功
     * public E remove(int index) 删除指定索引处的元素，返回被删除的元素
     * public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
     * public E get(int index) 返回指定索引处的元素
     * public int size() 返回集合中的元素的个数
     */
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<String>();
        //添加元素
        list.add("中国");
        list.add("china");
        list.add(1,"中国人");
        list.add("123");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //删除元素
        String str = list.remove(5);
        System.out.println("删除的元素是："+str);
        System.out.println("ddd已删除成功是"+list.remove("ddd"));
        //获取第5个位置上的值，并将值改成eee
        String getStr = list.get(5);
        System.out.println("第五个位置的值是："+getStr);
        System.out.println("修改前的集合："+list);
        list.set(5,"eee");
        System.out.println("修改后的集合："+list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("bbb")){
                list.set(0,"这是一个成功的案例");
            }
            System.out.println(list.get(i));
        }
    }
}
