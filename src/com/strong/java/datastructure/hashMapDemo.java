package com.strong.java.datastructure;

import java.util.HashMap;
//import com.alibaba.fastjson.JSON;

/**
 * @author: strong
 * @since: 2024/3/22 13:44
 * @description: HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
 * <p>
 * HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
 * <p>
 * HashMap 是无序的，即不会记录插入的顺序。
 * <p>
 * HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口
 */
public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<Integer, String>();
        //添加键值对到HashMap
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        sites.put(4, "Zhihu");

        //输出HashMap
        System.out.println("HashMap元素个数：" + sites.size());
        System.out.println("HashMap元素：" + sites);

        //获取key
        System.out.println("key为3的value是：" + sites.get(3));

        //删除key
        sites.remove(4);
        System.out.println("删除key为4的元素后的HashMap：" + sites);

        //遍历迭代
        for (Integer key : sites.keySet()) {
            System.out.println("Key: " + key + " & Value: " + sites.get(key));

        }

        //使用fastjson转换成json对象
//        String json = JSON.toJSONString(sites);
//        System.out.println("json对象：" + json);

    }

}
