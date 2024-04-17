package com.lancy.qq;
import chap6.FatherClass;
public class SonClass extends FatherClass {
	void print()
	{
		SonClass son=new SonClass();
		System.out.println("在子类的方法中：");
		System.out.println(son.str1);
		System.out.println(son.str2);
		//默认修饰符成员变量在包外无法访问，编译出错
		//System.out.println(son.str3);
		//private变量无法继承，编译出错
		//System.out.println(son.str4);
	}
}
