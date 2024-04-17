package com.strong.java.objectoriented.serialize;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: strong
 * @since: 2024/3/23 14:57
 * @description:
 */
public class classToJson {

    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        // 假设list中包含了一些Map对象，每个Map对象都包含了一些键值对
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("name", "John");
        map1.put("age", 25);

        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("name", "Jane");
        map2.put("age", 30);

        list.add(map1);
        list.add(map2);

        String listJson = JSON.toJSONString(list,true);
        System.out.println(listJson);

        Person p = new Person();
        p.setAge(25);
        p.setName("John");
        String personJson = JSON.toJSONString(p,true);
        System.out.println(personJson);

    }
}

class Person {

    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
