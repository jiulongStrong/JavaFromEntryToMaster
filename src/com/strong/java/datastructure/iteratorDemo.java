package com.strong.java.datastructure;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: strong
 * @since: 2024/3/22 16:45
 * @description:
 * Java迭代器（Iterator）是 Java 集合框架中的一种机制，是一种用于遍历集合（如列表、集合和映射等）的接口。
 *
 * 它提供了一种统一的方式来访问集合中的元素，而不需要了解底层集合的具体实现细节。
 *
 * Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。
 *
 * Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口
 *
 */
public class iteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(10);
        numbers.add(34);
        System.out.println(numbers);

        // 使用迭代器遍历ArrayList
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i <10){
                it.remove();
            }
        }
        System.out.println(numbers);

    }
}
