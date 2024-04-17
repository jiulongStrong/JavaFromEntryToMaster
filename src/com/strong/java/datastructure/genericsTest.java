package com.strong.java.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: strong
 * @since: 2024/3/22 17:24
 * @description:
 * 类型通配符一般是使用 ? 代替具体的类型参数。例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类
 */
public class genericsTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();


        name.add("aaa");
        age.add(11);
        number.add(222);

        getData(name);
//        getUpNumber(name);
        getUpNumber(age);
        getUpNumber(number);

    }

    public static void getData(List<?> data) {

        System.out.println("data ：" + data.get(0));
    }

    public static void getUpNumber(List<? extends Number> data){
        System.out.println("data : " + data.get(0));
    }
}


