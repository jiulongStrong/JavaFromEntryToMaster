/**  
 * @Title: ObjectparamTransfer.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 上午11:27:59
 * @version V1.0  
 */

/**
 * @ClassName: ObjectparamTransfer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 上午11:27:59
 *
 */

class Time
{
	public int hour;
	public int min;
	public int sec;
}


public class ObjectparamTransfer {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	
	Time time;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjectparamTransfer opt=new ObjectparamTransfer();
		opt.time=new Time();
		opt.time.hour=12;
		opt.time.min=45;
		opt.time.sec=20;
		System.out.println("time的属性值：");
		System.out.println("hour="+opt.time.hour);
		System.out.println("min="+opt.time.min);
		System.out.println("sec="+opt.time.sec);
		//将对象作为参数传递给方法objectMethod
		opt.objectMethod(opt.time);
		//对比执行方法后的变化
		System.out.println("执行方法后time的属性值：");
		System.out.println("hour="+opt.time.hour);
		System.out.println("min="+opt.time.min);
		System.out.println("sec="+opt.time.sec);
	}
	
	void objectMethod(Time t)
	{
		System.out.println("参数t的属性值：");
		System.out.println("hour="+t.hour);
		System.out.println("min="+t.min);
		System.out.println("sec="+t.sec);
		System.out.println("对t和time进行==比较，结果为："+(t==this.time));
		System.out.println("对t和time进行equals比较，结果为："+(t.equals(this.time)));
		System.out.println("改变t的实例变量值：");
		t.hour=8;
		t.min=12;
		t.sec=24;
	}
}
