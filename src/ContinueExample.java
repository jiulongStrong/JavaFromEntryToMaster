/**  
 * @Title: ContinueExample.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-4-26 ����05:21:35
 * @version V1.0  
 */

/**
 * @ClassName: ContinueExample
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-4-26 ����05:21:35
 *
 */
public class ContinueExample {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("99�˷���");
		System.out.print(" ");
		for(int k=1;k<=9;k++)
			System.out.print(k+"      ");
		System.out.println();
		out:for (int i = 1; i < 10; i++) {
			System.out.print(i+" ");	//��ӡ���ǵڼ���
			for (int j = 1; j <10; j++) {				
				if (j>i) {
					System.out.println();
					continue out;
				}else {
					System.out.print(i+"*"+j+"="+i*j+" ");
				}	
			}			
		}
	}
}
