package com.strong.java.objectoriented.serialize;

/**
 * @author: strong
 * @since: 2024/3/23 14:06
 * @description:
 */
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
