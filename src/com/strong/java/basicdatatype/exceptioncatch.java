package com.strong.java.basicdatatype;

/**
 * @author: strong
 * @since: 2024/3/18 21:15
 * @description:
 */
public class exceptioncatch {
    public static void main(String[] args) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
