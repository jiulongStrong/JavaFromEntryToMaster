package com.strong.java.basicdatatype;

import java.io.*;

/**
 * @author: strong
 * @since: 2024/3/20 15:24
 * @description:
 */
public class trywithresourcescase {
    public static void main(String[] args) {
        String line;
        // try-with-resources语句
        //JDK7 之后，Java 新增的 try-with-resource 语法糖来打开资源，并且可以在语句执行完毕后确保每个资源都被自动关闭 。
        //
        //try-with-resources 是一种异常处理机制，它可以简化资源管理代码的编写。
        //在 try-with-resources 语句中，声明的资源会在语句执行完毕后自动关闭。
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            while ((line = br.readLine()) != null){
                System.out.println("Line ==> "+line);
            }
        }catch (IOException e){
           System.out.println("IOException in try block =>"+e.getMessage());
        }

    }
}
