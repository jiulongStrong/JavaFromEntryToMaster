package com.strong.java.datastructure;

/**
 * @author: strong
 * @since: 2024/3/22 12:41
 * @description:以下情况使用 ArrayList :
 *
 * 频繁访问列表中的某一个元素。
 * 只需要在列表末尾进行添加和删除元素操作。
 * 以下情况使用 LinkedList :
 *
 * 你需要通过循环迭代来访问列表中的某些元素。
 * 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
 * LinkedList 继承了 AbstractSequentialList 类。
 *
 * LinkedList 实现了 Queue 接口，可作为队列使用。
 *
 * LinkedList 实现了 List 接口，可进行列表的相关操作。
 *
 * LinkedList 实现了 Deque 接口，可作为队列使用。
 *
 * LinkedList 实现了 Cloneable 接口，可实现克隆。
 *
 * LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。
 *
 * LinkedList 不支持高效的随机元素访问，而 ArrayList 支持。
 *
 * 此实现不是同步的。
 *
 * 如果多个线程同时访问一个 List，则必须自己实现访问同步。
 *
 */


import java.util.LinkedList;

public class linkedListDemo {

    //LinkedList<E> list = new LinkedList(Collection<? extends E> c); // 使用集合创建链表
    public static void main(String[] args) {

           LinkedList<String> sites = new LinkedList<>();
        sites.add("Wiki");
        sites.add("Taobao");
        sites.add("Google");
        sites.add("Runoob");
        System.out.println("LinkedList 初始化: \n" + sites);

        //头部添加元素
        sites.addFirst("Facebook");
        System.out.println("LinkedList 头部添加元素: \n" + sites);

        // 尾部添加元素
        sites.addLast("Zhihu");
        System.out.println("LinkedList 尾部添加元素: \n" + sites);

        //t头部删除元素
        sites.removeFirst();
        System.out.println(sites);
        //尾部删除元素
        sites.removeLast();
        System.out.println(sites);

        //指定位置添加元素
        sites.add(1, "Baidu");
        System.out.println(sites);

        //指定位置删除元素
        sites.remove(1);
        System.out.println(sites);

        //遍历迭代
        for (String i : sites){

            System.out.println(i);
        }

        //返回链表对应的数组
        String[] arr = sites.toArray(new String[0]);
        System.out.println("arr类型: "+arr.getClass().getName());



    }
}
