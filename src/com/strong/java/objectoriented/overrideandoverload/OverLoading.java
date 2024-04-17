package com.strong.java.objectoriented.overrideandoverload;

/**
 * @author: strong
 * @since: 2024/3/22 08:21
 * @description:
 */
public class OverLoading {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public int test(int a){
        System.out.println("test2");
        return 2;
    }

    public int test(int a,char b){
        System.out.println("test3");
        return 3;
    }

    public int test(char a,int b){
        System.out.println("test4");
        return 4;
    }

    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,'a'));
        System.out.println(o.test('a',1));

    }
}

/*
* 重载方法较多时，可依据情况使用：1、参数对象；2、建造者模式；3、泛型编程等*/
