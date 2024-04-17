import java.util.Scanner;

/**  
 * @Title: AverageTemperature.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 下午03:26:04
 * @version V1.0  
 */

/**
 * @ClassName: AverageTemperature
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 下午03:26:04
 *
 */
public class AverageTemperature {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double average,sum=0;
		double[] temperature=new double[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一周7天的温度：");
		for (int count = 0; count < temperature.length; count++) 
		{
			temperature[count]=sc.nextDouble();
			sum+=temperature[count];			
		}
		average=sum/7;
		for (int count = 0; count < temperature.length; count++) {
			if (temperature[count]<average) 
				System.out.println("第"+(count+1)+"天气温低于平均气温");
			else if (temperature[count]>average) 
				System.out.println("第"+(count+1)+"天气温高于平均气温");
			else 
				System.out.println("第"+(count+1)+"天气温等于平均气温");			
		}
	}

}
