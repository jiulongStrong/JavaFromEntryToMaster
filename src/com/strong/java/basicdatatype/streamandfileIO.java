package com.strong.java.basicdatatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: strong
 * @since: 2024/3/17 18:59
 * @description:
 */
public class streamandfileIO {

    public static void main(String[] args) throws IOException {

        //从控制台读取多字符输入
//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("请输入字符，按下‘q’键退出：");
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');

        // 使用 System.in 创建 BufferedReader
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br1.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
