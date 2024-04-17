package com.strong.java.objectoriented.interfaces;

/**
 * @author: strong
 * @since: 2024/3/21 18:05
 * @description:
 */
public class ImplementsTest implements Hockey{
    @Override
    public void method1() {
        Hockey.super.method1();
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void travel() {
        System.out.println("travel");
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("setHomeTeam");

    }

    @Override
    public void setGuestTeam(String name) {
        System.out.println("setGuestTeam");

    }

    public static void main(String[] args) {
        new ImplementsTest().method1();
        new ImplementsTest().eat();
        new ImplementsTest().travel();
        new ImplementsTest().setHomeTeam("home");
        new ImplementsTest().setGuestTeam("guest");

    }
}
