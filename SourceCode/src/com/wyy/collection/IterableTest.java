package com.wyy.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableTest {

    Iterable i1 = null;
    Iterator i2 = null;

    ListIterator i3 = null;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");

        Iterator iterable = list.iterator();
        System.out.println(iterable.next());

        ListIterator listIterator = list.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

    }

}
