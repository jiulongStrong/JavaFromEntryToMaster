package com.strong.java.objectoriented.serialize;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: strong
 * @since: 2024/3/23 14:58
 * @description:
 */
public class jsonToClass {

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

        JSONArray j = JSONArray.parseArray(JSONArray.toJSONString(list));

        for (int i = 0; i < j.size(); i++) {
            System.out.println(j.get(i));
        }
    }
}
