/**  
 * @Title: OverLoadDemo.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 ����03:54:51
 * @version V1.0  
 */

/**
 * @ClassName: OverLoadDemo
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 ����03:54:51
 *
 */
public class OverLoadDemo {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	
	void method()
	{
		System.out.println("�޲�����������");
	}
//	void method(int a)
//	{
//		System.out.println("����Ϊint���ͱ�����");
//	}
	void method(double a)
	{
		System.out.println("����Ϊint���ͱ�����");
	}
	void method(String b)
	{
		System.out.println("����ΪString���ͱ�����");
	}
	void method(int a,double b)
	{
		System.out.println("����Ϊint��double���ͱ�����");
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		OverLoadDemo ov=new OverLoadDemo();
		//���ݲ������ò�ͬ�ķ���
		ov.method();
		ov.method("what is up?");
		ov.method(5);
		ov.method(3,4.5d);
	}

}
