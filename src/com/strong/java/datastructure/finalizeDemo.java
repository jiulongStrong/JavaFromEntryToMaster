package com.strong.java.datastructure;

/**
 * @author: strong
 * @since: 2024/3/17 11:29
 * @description:
 */
public class finalizeDemo {

    public static void main(String[] args) {
        Cake cake1 = new Cake(1);
        Cake cake2 = new Cake(2);
        Cake cake3 = new Cake(3);
        cake2 = cake3 = null;
        System.gc();  //调用GC回收
    }
}

//Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用

class Cake extends Object{
    private int id;

    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake对象被垃圾回收了，它的id是：" + id);
    }
}
