
public class WeiYuanSuanFu {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a=6; //��������Ϊ0110
		int b=3;	//��������Ϊ0011
		int i1=a&b;
		int i2=a|b;
		int i3=a^b;
		int i4=~b;//&0x0f
		System.out.println("ִ����������Ľ������"+i1);
		System.out.println("ִ�л�������Ľ������"+i2);
		System.out.println("ִ�����������Ľ������"+i3);
		System.out.println("ִ�з�������Ľ������"+i4);
	}

}
