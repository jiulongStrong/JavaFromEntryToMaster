package com.strong.java.objectoriented.inherit;

/**
 * @author: strong
 * @since: 2024/3/21 17:22
 * @description:
 */
public class extendsTest {

    public static void main(String[] args) {
        Animal a = new Animal("ancestor",0);
        a.eat();
        Dog dog =new Dog("dog",1);
        dog.eattest();

    }
}
