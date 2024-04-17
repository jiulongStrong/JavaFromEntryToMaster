package com.strong.java.basicdatatype;

import java.util.Scanner;

/**
 * @author: strong
 * @since: 2024/3/18 20:46
 * @description:
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //next方式接受
//        System.out.print("next方式接受：");
//        if(scanner.hasNext()){
//            String str1 = scanner.next();
//            System.out.println("输入的数据为：" + str1);
//        }

        //nextLine方式接受
        System.out.print("nextLine方式接受：");
        if(scanner.hasNextLine()){
            String str2 = scanner.nextLine();
            System.out.println("输入的数据为：" + str2);
        }

        scanner.close();
    }
}
