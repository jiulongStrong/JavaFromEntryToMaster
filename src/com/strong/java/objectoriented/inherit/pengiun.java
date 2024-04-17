package com.strong.java.objectoriented.inherit;

/**
 * @author: strong
 * @since: 2024/3/21 17:13
 * @description:
 */
public class pengiun extends Animal {
    public pengiun(String name, int id) {
        super(name, id);
    }
}

/*
 * 继承的特性
子类拥有父类非 private 的属性、方法。

子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。

子类可以用自己的方式实现父类的方法。

Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 B 类继承 A 类，C 类继承 B 类，所以按照关系就是 B 类是 C 类的父类，A 类是 B 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。

提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）
*
* Java继承支持多重继承，不支持多继承。
* 多继承采用接口，用implement变相的实现多继承
 */
