/**  
* @Title: TigerDemo.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-10 下午05:02:21
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: TigerDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 下午05:02:21
 *
 */
public class TigerDemo {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Tiger tiger=new Tiger();
		//对tiger的属性进行赋值
		tiger.type="Tiger";
		tiger.name="zhangcong";
		tiger.age=28;
		tiger.weight=88;
		tiger.tigerType="东北虎";
		tiger.from="长白山";
		//打印出属性值
		System.out.println("Animal属性：种类="+tiger.type);
		System.out.println("Animal属性：姓名="+tiger.name);
		System.out.println("Animal属性：年龄="+tiger.age);
		System.out.println("Animal属性：体重="+tiger.weight);
		System.out.println("Animal属性：老虎种类="+tiger.tigerType);
		System.out.println("Animal属性：产地="+tiger.from);
		//使用tiger调用方法
		System.out.println("Animal方法：呼吸");
		tiger.breath();
		System.out.println("Animal方法：吃饭");
		tiger.eat();
		System.out.println("Animal方法：睡觉");
		tiger.sleep();
		System.out.println("Animal方法：奔跑");
		tiger.tigerRun();		
	}
}
