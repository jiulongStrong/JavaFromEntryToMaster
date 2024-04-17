package com.strong.java.objectoriented.abstractclassdemo;

import javax.swing.*;

/**
 * @author: strong
 * @since: 2024/3/22 11:35
 * @description:
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    //构造方法
    public Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public String toString(){
        return name + " " + address + " " + number;
    }

    //访问器方法
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public int getNumber(){
        return number;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }
}
