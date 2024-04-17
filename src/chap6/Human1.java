package chap6;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Human1 {
	//成员属性都是私有的
	private String name;
	private String sex;
	private int age;
	private String addr;
	
	//public的设置和访问方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	/**
	* <p>Title: </p>
	* <p>Description: </p>
	* @param name
	* @param sex
	* @param age
	* @param addr
	*/
	public Human1(String name, String sex, int age, String addr) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.addr = addr;
	}
	/**
	 * @Title: pub
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public void work() {
		System.out.println("我在工作");
	}
	
	public void eat()
	{
		System.out.println("我在吃法");
	}
	
	 
}
