/**  
 * @Title: HumanDemo2.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 下午04:36:54
 * @version V1.0  
 */

/**
 * @ClassName: HumanDemo2
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 下午04:36:54
 *
 */

class Human2{
	String name;
	String sex;
	int age;
	String addr;
	//自定义构造函数
	public Human2(String hName,String hSex,int hAge,String hAddr){
		name=hName;
		sex=hSex;
		age=hAge;
		addr=hAddr;
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

public class HumanDemo2 {
	public static void  main(String args[]) {
		//创建2个对象
		Human2 zhangsan=new Human2("张三","男",25,"中国广州");
//		Human lisi=new Human();
//		//对zhangsan赋值
//		zhangsan.name="张三";
//		zhangsan.sex="男";
//		zhangsan.age=25;
//		zhangsan.addr="中国广州";
//		//把zhangsan赋值给lisi
//		lisi=zhangsan;
//		//打印出赋值后的结果
		System.out.println("张三的姓名："+zhangsan.name);
//		System.out.println("李四的姓名："+lisi.name);
//		System.out.println("改变李四的姓名");
//		lisi.name="李四";
//		System.out.println("现在张三的姓名："+zhangsan.name);
//		System.out.println("现在李四的姓名："+lisi.name);
	}
}
