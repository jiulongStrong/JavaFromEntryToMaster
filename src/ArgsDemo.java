/**  
 * @Title: ArgsDemo.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-28 ����03:50:05
 * @version V1.0  
 */

/**
 * @ClassName: ArgsDemo
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-28 ����03:50:05
 *
 */
public class ArgsDemo {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������"+args.length+"������");
		for (int i = 0; i < args.length; i++)			
			System.out.println("��"+i+"������"+args[i]);
	}

}
