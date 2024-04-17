package com.strong.java.objectoriented.interfaces;

/**
 * @author: strong
 * @since: 2024/3/21 17:45
 * @description:
 */
public class MammalInt implements Animal,Sport{

    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }

    @Override
    public void setHomeTeam(String name) {
        System.out.println("MammalInt setHomeTeam " + name);
    }

    @Override
    public void setGuestTeam(String name) {
        System.out.println("MammalInt setGuestTeam " + name);
    }
}
