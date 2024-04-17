/**  
 * @Title: HumanDemo3.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 上午09:35:04
 * @version V1.0  
 */

class Human1{
	String name;
	String sex;
	int age;
	String addr;
	//自定义构造函数
	public Human1()
	{
		name=null;
		sex=null;
		age=0;
		addr=null;
	}
	
	public Human1(String hName,String hSex)
	{
		name=hName;
		sex=hSex;
		System.out.println("第二个构造函数被调用");
	}
	
	public Human1(String hName,String hSex,int hAge,String hAddr){
		this(hName, hSex);  //调用第二个构造函数
		age=hAge;
		addr=hAddr;
		System.out.println("第三个构造函数被调用");
	}
	void work()
	{
		System.out.println("我在工作");
	}
	void eat()
	{
		System.out.println("我在吃饭");
	}
}

/**
 * @ClassName: HumanDemo3
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 上午09:35:04
 *
 */
public class HumanDemo3 {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Human1 lisi=new Human1("李四", "男", 25, "中国广州");
		System.out.println("李四的信息：");
		System.out.println("姓名："+lisi.name+"\n 性别："+lisi.sex+"\n 年龄："+lisi.age+"\n 地址："+lisi.addr);
	}

}
