package com.javalearning.collection;

import java.util.ArrayList;
import java.util.List;

public class FinalListTest {

    final List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        FinalListTest fl = new FinalListTest();
        fl.list.add("ccc");
        fl.list.add("dddc");
        System.out.println(fl.list);
    }
}
