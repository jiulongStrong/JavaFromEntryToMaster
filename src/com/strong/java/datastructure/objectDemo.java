package com.strong.java.datastructure;

/**
 * @author: strong
 * @since: 2024/3/22 16:53
 * @description:
 */
public class objectDemo {

    public static void main(String[] args) {

        Object obj = new Object();
        Object obj1 = new Object();

        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj1));


    }
}
