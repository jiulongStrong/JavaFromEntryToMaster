/**  
* @Title: CloneDemo.java
* @Package chap6
* @Description: TODO(用一句话描述该文件做什么)
* @author Strong 805267636@qq.com  
* @date 2016-5-13 下午12:06:14
* @version V1.0  
*/ 
package chap6;

/**
 * @ClassName: CloneDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-13 下午12:06:14
 *
 */
public class CloneDemo {

	public static void main(String[] args) {
		Addr addr=new Addr("中国", "广东", "广州");
		Human zhangsan=new Human("张三", "男", 25, addr);
		Human lisi=(Human)zhangsan.clone();		//克隆zhangsan并赋值给lisi（有一块新的内存划分给lisi）
		System.out.println("张三的地址：");
		System.out.println(zhangsan.addr.country+zhangsan.addr.province+zhangsan.addr.city);
		System.out.println("李四的地址：");
		System.out.println(lisi.addr.country+lisi.addr.province+lisi.addr.city);
		System.out.println("修改李四的地址为：中国山东青岛");
		lisi.addr.country="中国";
		lisi.addr.province="山东";
		lisi.addr.city="青岛";
		System.out.println("张三的地址：");
		System.out.println(zhangsan.addr.country+zhangsan.addr.province+zhangsan.addr.city);
		System.out.println("李四的地址：");
		System.out.println(lisi.addr.country+lisi.addr.province+lisi.addr.city);
	}

}
