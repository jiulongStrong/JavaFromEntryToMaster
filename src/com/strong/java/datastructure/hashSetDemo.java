package com.strong.java.datastructure;

import java.util.HashSet;

/**
 * @author: strong
 * @since: 2024/3/22 13:35
 * @description:
 * HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
 *
 * HashSet 允许有 null 值。
 *
 * HashSet 是无序的，即不会记录插入的顺序。
 *
 * HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
 *
 * HashSet 实现了 Set 接口
 *
 * HashSet 实现了 Cloneable 接口，即覆盖了函数 clone()，能被克隆。
 *
 * HashSet 实现了 java.io.Serializable 接口，这意味着 HashSet 支持序列化，能够通过序列化去传输。
 *
 * 实现原理：HashSet 底层使用 HashMap 来保存所有元素，因此 HashSet 的实现比较简单，相关 HashSet 的操作,
 * 其实都是直接调用底层 HashMap 的相关方法来完成.
 */
public class hashSetDemo {

    public static void main(String[] args) {

        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);

        //判断元素是否存在
        System.out.println("Runoob 是否存在: " + sites.contains("123"));

        //删除元素
        sites.remove("Taobao");
        System.out.println(sites);

        //计算大小
        System.out.println("Set 的大小: " + sites.size());

        //遍历
        for(String i:sites){

            System.out.println(i);
        }

        //清空元素
        sites.clear();

        //判断是否为空
        System.out.println(sites.isEmpty());

    }
}
