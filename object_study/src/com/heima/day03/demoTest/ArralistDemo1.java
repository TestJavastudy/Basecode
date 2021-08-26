package com.heima.day03.demoTest;

import java.util.ArrayList;

public class ArralistDemo1 {
    /**
     * public ArrayList()
     * 构造一个初始容量为10的空列表。
     * public ArrayList<E>();
     * 按照集合的迭代器返回的顺序构造一个包含指定集合元素的列表。
     * <E> 泛型，E 只能是引用数据类型
     * public boolean add​(E e)
     * 将指定的元素追加到此列表的末尾。
     * public void add​(int index, E element)
     * 将指定元素插入此列表中的指定位置。 将当前位置的元素（如果有）和任何后续元素向右移动（将其添加到索引中）。
     */
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<String>();
        list.add("中国");
        list.add("china");
        list.add(1,"中国人");
        System.out.println(list);
//        System.out.println(list.toArray());
    }
}
