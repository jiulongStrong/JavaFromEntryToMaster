package com.strong.java.objectoriented.polymorphism;

/**
 * @author: strong
 * @since: 2024/3/22 10:37
 * @description:
 */
public class virtualclass {
    public static void main(String[] args) {
        Test1 b = new Derived();
        b.show();  // 输出 "Derived class show() called."
    }
}

class Derived extends Test1 {
    @Override
    void show() {
        System.out.println("Derived class show() called.");
    }
}

class Test1 {
    void show() {
        System.out.println("Base class show() called.");
    }
}
