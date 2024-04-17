package com.strong.java.basicdatatype;

import jdk.nashorn.internal.runtime.FunctionInitializer;

/**
 * @author: strong
 * @since: 2024/2/20 15:42
 * @description:
 */
public class DefaultValueTest {
    static boolean bool;
    static byte by;
    static short sho;
    static char ch;
    static int in;
    static long lg;
    static float fl;
    static double db;
    static String str;
    final static int FINAL_INT = 10;

//    FINAL_INT = 20; // 编译错误，不能对final的常量进行修改





    public static void main(String[] args) {
        System.out.println("boolean:" + bool);
        System.out.println("byte:" + by);
        System.out.println("short:" + sho);
        System.out.println("char:" + ch);
        System.out.println("int:" + in);
        System.out.println("long:" + lg);
        System.out.println("float:" + fl);
        System.out.println("double:" + db);
        System.out.println("string:" + str);
        System.out.println("===================================");

        //自动类型转换
//    低  ------------------------------------>  高
//
//    byte,short,char—> int —> long—> float —> double
        //自动提升原则：表达式结果的类型自动提升为操作数中最高级的类型
        int i = 10;
        byte b = (byte) i;
        System.out.println("int强制类型转换为byte后的值等于"+b);
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        System.out.println("===================================");

        //强制类型转换
        double d = 123.456;
        int i3 = (int)d;//强制类型转换为int
        System.out.println("double强制类型转换为int后的值等于"+i3);
         }
}
