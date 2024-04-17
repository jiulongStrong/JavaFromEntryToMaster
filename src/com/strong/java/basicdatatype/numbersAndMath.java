package com.strong.java.basicdatatype;

/**
 * @author: strong
 * @since: 2024/3/17 09:46
 * @description:
 */
public class numbersAndMath {
    public static void main(String[] args) {
        double [] nums = {1.4,1.5,1.6,-1.4,-1.5,-1.6,0, -0.0, 0.0};
        for (double num : nums) {
            test(num);
        }
    }

    public static void test(double num){
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }
}
