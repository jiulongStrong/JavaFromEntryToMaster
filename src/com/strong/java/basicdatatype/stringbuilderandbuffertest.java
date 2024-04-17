package com.strong.java.basicdatatype;

/**
 * @author: strong
 * @since: 2024/3/17 10:18
 * @description:
 */
public class stringbuilderandbuffertest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c");
        System.out.println(sb.toString());

        StringBuffer sbf = new StringBuffer();
        sbf.append("a").append("b").append("c");
        System.out.println(sbf.toString());


            StringBuilder sb1 = new StringBuilder(10);
            sb1.append("Runoob..");
            System.out.println(sb1);
            sb1.append("!");
            System.out.println(sb1);
            sb1.insert(8, "Java");
            System.out.println(sb1);
            sb1.delete(5,8);
            System.out.println(sb1);

    }
}
