package com.strong.java.objectoriented.interfaces;
/**
 * @author: strong
 * @since: 2024/3/21 18:00
 * @description:
 */

/**
* 接口允许多继承
* 接口中可以定义默认方法，默认方法可以在接口中实现，也可以在接口的实现类中实现
*
*
*/


public interface Hockey extends Sport,Animal{

     //接口中的默认方法
     default void method1(){
         System.out.println("method1");
     }
     //接口中的静态方法
     static void method2(){
         System.out.println("method2");
     }
}
