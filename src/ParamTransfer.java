/**  
 * @Title: ParamTransfer.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 上午10:58:26
 * @version V1.0  
 */

/**
 * @ClassName: ParamTransfer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 上午10:58:26
 *
 */
public class ParamTransfer {
	
	public int money;
	void amethod(int i)
	{	//比较形参i和money的值
		System.out.println("方法得到i的值为："+i);
		i=i*5;
		System.out.println("执行i=i*5后i的值为："+i);
		System.out.println("money的值为："+this.money);
	}
	
	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ParamTransfer pt=new ParamTransfer();
		pt.money=100;
		//把money作为参数传递给方法
		pt.amethod(pt.money);
	}
}

//传值