/**  
 * @Title: ReturnDemo.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-27 ����08:55:45
 * @version V1.0  
 */

/**
 * @ClassName: ReturnDemo
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-27 ����08:55:45
 *
 */
public class ReturnDemo {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < 10; i++) {
			if (i<5) 
				System.out.println("��"+i+"��ѭ��");
			else if(i==5)
				return;
			//the statement below will never execute
			else
				System.out.println("��"+i+"��ѭ��");
			}
			
		}
	}
