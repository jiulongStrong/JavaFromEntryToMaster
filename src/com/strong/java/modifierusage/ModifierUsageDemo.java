package com.strong.java.modifierusage;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @author: strong
 * @since: 2024/3/15 18:21
 * @description:
 */
public class ModifierUsageDemo {
    private String format;  // 私有属性,其他类只能通过getter和setter方法访问

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

/*
protected 需要从以下两个点来分析说明：

子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；

子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。
static 修饰符，用来修饰类方法和类变量。

final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。

abstract 修饰符，用来创建抽象类和抽象方法。

synchronized 和 volatile 修饰符，主要用于线程的编程。

synchronized 修饰符
synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。

volatile 修饰符
volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值
* */

     public static void main(String[] args) {
         //方法体

     }
}