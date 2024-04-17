package com.strong.java.basicdatatype;

/**
 * @author: strong
 * @since: 2024/2/20 16:09
 * @description:
 */
public class ParamTypedemo {
    //实例变量
    private int instantVariable;
    //类变量
    private static int staticVariable;
    //参数变量
    public void method(int param){
        //局部变量
        int localVariable = 10;
        //使用变量
        instantVariable = localVariable;
        staticVariable = param;
        System.out.println("实例变量：" + instantVariable);
        System.out.println("类变量：" + staticVariable);
        System.out.println("参数变量：" + param);
        System.out.println("局部变量：" + localVariable);

    }
    public static void main(String[] args) {
        ParamTypedemo paramTypedemo = new ParamTypedemo();
        paramTypedemo.method(20);
         }
}
