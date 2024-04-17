/**  
* @Title: Human.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-13 上午11:58:11
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: Human
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-13 上午11:58:11
 *
 */
class Human implements Cloneable {
	String name;
	String sex;
	int age;
	Addr addr;

	public Human(String name,String sex,int age,Addr addr) {
		// TODO 自动生成的构造函数存根
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.addr=addr;		
	}
	
	void work()
	{
		System.out.println("我在工作");
	}
	
	void eat()
	{
		System.out.println("我在吃饭");
	}
	
	//对象克隆的方法
	public Object clone()
	{
		Human h=null;
		try {
			h=(Human)super.clone();
			h.addr=(Addr)this.addr.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return h;
	}
}
