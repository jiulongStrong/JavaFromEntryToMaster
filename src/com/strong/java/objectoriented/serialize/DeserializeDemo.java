package com.strong.java.objectoriented.serialize;

import java.io.*;

/**
 * @author: strong
 * @since: 2024/3/23 14:36
 * @description:
 */
public class DeserializeDemo {

    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("./src/com/strong/java/objectoriented/serialize/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e1) {
            System.out.println("Employee class not found");
            e1.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
