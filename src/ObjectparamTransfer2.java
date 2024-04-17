import org.omg.CORBA.Object;

/**  
 * @Title: ObjectparamTransfer2.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 上午11:54:37
 * @version V1.0  
 */

/**
 * @ClassName: ObjectparamTransfer2
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 上午11:54:37
 *
 */

class Time1
{
	public int hour;
//	public int min;
//	public int sec;
	
	
}

public class ObjectparamTransfer2 {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	
	Time time1;
	Time time2;
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjectparamTransfer2 opt=new ObjectparamTransfer2();
		opt.time1=new Time();
		opt.time2=new Time();
		opt.time1.hour=12;
		opt.time2.hour=23;
		System.out.println("交换前的属性值：");
		System.out.println("time1.hour="+opt.time1.hour);
		System.out.println("time1.hour="+opt.time2.hour);
		//调用swap方法
		opt.swap(opt.time1, opt.time2);
		System.out.println("交换后的属性值：");
		System.out.println("time1.hour="+opt.time1.hour);
		System.out.println("time1.hour="+opt.time2.hour);
		
		int a='a'+ 5;
		Float f=5+5.5f;
		String s= "join"+ 3;
	}
	//方法试图交换2个对象
	void swap(Time t1,Time t2)
	{
		Time tempTime;
		tempTime=t1;
		t1=t2;
		t2=tempTime;
	}
}
