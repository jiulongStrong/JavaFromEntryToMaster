/**  
* @Title: Animal.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-10 下午03:54:18
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: Animal
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 下午03:54:18
 *
 */
abstract class Animal {
	
	/**
	 * @ClassName: Fish
	 * @Description: TODO(这里用一句话描述这个类的作用)
	 * @author Strong 805267636@qq.com
	 * @date 2016-5-11 上午11:09:45
	 *
	 */
	String type;
	String name;
	int age;
	int weight;
	void eat()
	{
		System.out.println("animal eat");
	}
	void sleep()
	{
		System.out.println("animal sleep");
	}
	abstract void breath();
	
}

