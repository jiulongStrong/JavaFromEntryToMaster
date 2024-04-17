package com.strong.java.datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author: strong
 * @since: 2024/3/22 12:11
 * @description:特点： 动态数组，可变大小。
 * 优点： 高效的随机访问和快速尾部插入。
 * 缺点： 中间插入和删除相对较慢。
 * 适用场景： 需要随机访问数据的大型数据集。
 * 源码分析： 基于动态数组的数据结构。
 * 实现原理： 自动扩容。
 * 相关方法： add(int index, E element)，get(int index)，set(int index, E element)，remove(int index)。
 * 复杂度： 添加元素： O(1)，获取元素： O(1)，修改元素： O(1)，删除元素： O(n)。
 * 内存占用： O(n)。
 * 线程安全： 不安全。
 * 底层数据结构： 动态数组。
 * 是否允许存储null值： 允许。
 * 是否有序： 有序。
 * 是否允许重复元素： 允许。
 * 是否支持快速查找： 支持。
 * 是否支持快速插入和删除： 支持。
 * 是否支持快速随机访问： 支持。
 * 是否支持快速扩容： 支持。
 * 是否支持快速缩容： 支持。
 */

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> site = new ArrayList<String>();
        //添加
        site.add("Wiki");
        site.add("Taobao");
        site.add("Google");
        site.add("Runoob");

        System.out.println(site);

        //访问
        System.out.println(site.get(1));

        //修改
        site.set(1, "Wiki");
        System.out.println(site);

        //删除
        site.remove("Weibo");
        System.out.println(site);

        //计算大小
        System.out.println(site.size());

        //遍历
        for (int i = 0; i < site.size(); i++) {

            System.out.println(site.get(i));
        }

        for (String i : site){

            System.out.println(i);
        }

        //sort() 方法可以对字符或数字列表进行排序
        Collections.sort(site);
        System.out.println(site);





    }

}
