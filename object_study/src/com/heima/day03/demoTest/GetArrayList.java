package com.heima.day03.demoTest;

import java.util.ArrayList;

public class GetArrayList {
    /**
     * 集合的遍历
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
