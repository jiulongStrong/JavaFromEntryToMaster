/**  
* @Title: Tigers.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-11 下午03:15:52
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: Tigers
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-11 下午03:15:52
 *
 */
public class Tigers implements Mammal {

	public void sleep() {
		// TODO 自动生成的方法存根
		System.out.println("tiger sleep");
	}
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("tiger eat");
	}
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("the tiger run");
	}
	public void breath() {
		// TODO 自动生成的方法存根
		System.out.println("tiger breath");
	}
	
	public static void main(String[] args) {
		Tigers tigers=new Tigers();
		tigers.breath();
		tigers.eat();
		tigers.sleep();
		tigers.run();
	}
	
}
