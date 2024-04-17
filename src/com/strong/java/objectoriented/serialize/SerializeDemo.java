package com.strong.java.objectoriented.serialize;


import java.io.*;

/**
 * @author: strong
 * @since: 2024/3/23 13:59
 * @description:
 */
public class SerializeDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "John";
        e.address = "50 St. NW";
        e.SSN = 111222333;
        e.number = 555;

        try{
            FileOutputStream fileOut =
            new FileOutputStream("./src/com/strong/java/objectoriented/serialize/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");

        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
