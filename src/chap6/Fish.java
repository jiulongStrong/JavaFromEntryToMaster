/**  
* @Title: Fish.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-11 上午11:11:01
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: Fish
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-11 上午11:11:01
 *
 */
class Fish extends Animal {
	String fishType;
	void swim()
	{
		System.out.println("鱼在游泳");
	}
	void breath()
	{
		System.out.println("鱼是用鳃呼吸的");
	}
}
