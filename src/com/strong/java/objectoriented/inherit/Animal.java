package com.strong.java.objectoriented.inherit;

/**
 * @author: strong
 * @since: 2024/3/21 17:08
 * @description:
 */
public class Animal {
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    public void introduction(){
        System.out.println("大家好，我是"+name+",编号是"+id);
    }
}
