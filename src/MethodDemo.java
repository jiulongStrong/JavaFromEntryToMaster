/**  
 * @Title: MethodDemo.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 下午02:29:32
 * @version V1.0  
 */

/**
 * @ClassName: MethodDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 下午02:29:32
 *
 */

class Human{
	//定义属性
	String name;
	String sex;
	int age;
	String addr;
	void work()
	{
		System.out.println("我在工作");
	}
	void eat()
	{
		System.out.println("我在吃饭");
	}
	
	String getState(int time)
	{
		String state=null;
		if (time>=0 && 24>=time) {
			if (time>=8 && 17>time) 
				state="我在工作";
			else if (time>=17 && 22>time) 
				state="我在学习";
			else if (time>=22 || time<8)
				state="我在睡觉";
		}else
			state="错误的时间";
		return state;
	}
}



public class MethodDemo {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Human zhangsan=new Human();
		//设定对象属性
		zhangsan.name="张三";
		zhangsan.sex="男";
		zhangsan.age=25;
		zhangsan.addr="中国广州";
		System.out.println(zhangsan.name+"晚上23点钟你在干嘛？");
		//调用getstate方法返回状态
		System.out.println(zhangsan.getState(23));
		System.out.println("下午3点呢？");
		System.out.println(zhangsan.getState(15));
		
	}

}
