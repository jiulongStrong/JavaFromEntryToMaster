package com.strong.java.datastructure;

/**
 * @author: strong
 * @since: 2024/3/22 17:12
 * @description:
 */
public class genericsClassDemo<T> {

    private T t;
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        genericsClassDemo<String> stringDemo = new genericsClassDemo<String>();
        genericsClassDemo<Integer> integerDemo = new genericsClassDemo<Integer>();

        integerDemo.setT(new Integer(100));
        stringDemo.setT(new String("hello"));

        System.out.printf("整型值为 :%d\n\n", integerDemo.getT());
        System.out.printf("字符串为 :%s\n\n", stringDemo.getT());
    }
}
