package com.strong.java.flowcontrol;

/**
 * @author: strong
 * @since: 2024/3/16 21:47
 * @description:
 */
public class switchcase {
    public static void main(String[] args) {
        int day = 4;
        //当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
           default:
               System.out.println("Invalid day");
               break;
        }
    }

    //当case比较多或代码过于臃肿时，用策略模式替换switch case。详见.strong.java.designmodel.strategypattern

}