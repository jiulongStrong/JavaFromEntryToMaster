package chap6;

public class Human2 {
	private String name;
	private String sex;
	private int age;
	private Address addr;
	Human2(String name, String sex, int age, Address addr) {
		
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.addr = addr;
	}
	
	public String toString()
	{
		return "姓名："+name+" 性别："+sex+" 年龄："+age+" 地址："+addr.toString();
	}	
}
