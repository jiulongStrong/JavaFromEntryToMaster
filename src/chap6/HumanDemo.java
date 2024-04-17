/**  
* @Title: HumanDemo.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-16 上午11:18:55
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: HumanDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-16 上午11:18:55
 *
 */
public class HumanDemo {
	public static void main(String[] args) {
		Human1 zhangsan=new Human1("张三", "男", 25, "中国广东广州");
		System.out.println("打印出张三的信息：");
		System.out.println("姓名：" +zhangsan.getName());
		System.out.println("性别：" +zhangsan.getSex());
		System.out.println("年龄：" +zhangsan.getAge());
		System.out.println("地址：" +zhangsan.getAddr());
	}
}
