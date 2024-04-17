package com.strong.java.objectoriented.inherit;

/**
 * @author: strong
 * @since: 2024/3/21 17:20
 * @description:
 */
public class Dog extends Animal{

    public Dog(String name, int id) {
        super(name, id);
    }

    public void eat(){
        System.out.println("狗吃骨头");
    }

    void eattest(){
        this.eat();   //调用自己的方法
        super.eat();    //调用父类的方法
    }
}
