/**  
 * @Title: ParamTransfer.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 ����10:58:26
 * @version V1.0  
 */

/**
 * @ClassName: ParamTransfer
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 ����10:58:26
 *
 */
public class ParamTransfer {
	
	public int money;
	void amethod(int i)
	{	//�Ƚ��β�i��money��ֵ
		System.out.println("�����õ�i��ֵΪ��"+i);
		i=i*5;
		System.out.println("ִ��i=i*5��i��ֵΪ��"+i);
		System.out.println("money��ֵΪ��"+this.money);
	}
	
	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ParamTransfer pt=new ParamTransfer();
		pt.money=100;
		//��money��Ϊ�������ݸ�����
		pt.amethod(pt.money);
	}
}

//��ֵ