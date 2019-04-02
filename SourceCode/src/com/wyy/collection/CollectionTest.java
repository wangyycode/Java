package com.wyy.collection;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

public class CollectionTest {

    Collection c = null;


    /*
     *
     * Collection 接口定义集合类的方法
     *
     * 继承 Iterable 接口表示可迭代
     *
     * int size()
     * boolean isEmpty()
     * boolean contains()
     *
     *
     * Iterator<E> iterator();
     *
     *
     * boolean add(E e)
     * boolean remove(Object o)
     *
     *
     * boolean addAll();
     * boolean containsAll();
     * boolean removeAll();
     *
     * void clear();
     *
     * Object[] toArray();
     *
     *
     * */

    List l = null;

    /*
     *
     * List 接口，定义抽象方法
     *
     * 继承 Collection
     *
     * int size();
     * boolean isEmpty();
     * boolean contains();
     *
     * boolean add();
     * boolean remove();
     *
     *
     * boolean addAll();
     * boolean removeAll();
     * boolean containsAll();
     *
     * boolean retainAll();
     *
     * 新增：
     *
     * void replaceAll();
     * void sort();
     *
     * E get();
     * E set();
     * void add();
     * void remove();
     *
     * int indexOf();
     * int lastIndexOf();
     *
     * ListIterator listIterator();
     *
     * */

    AbstractCollection a = null;

    /*
     *
     * AbstractCollection 抽象集合类
     *
     * 继承了Collection，实现了其大部分方法
     *
     * 两个抽象方法：
     *
     * abstract Iterator iterator();
     * abstract int size();
     *
     * 实现了其他的方法
     *
     *
     *
     *
     *
     * */

    AbstractList abstractList = null;


    /*
     * AbstractList 抽象类
     * 继承 AbstractList ,实现 List 接口
     *
     * 抽象方法：
     *
     * E get();
     *
     *
     *
     * */


}
