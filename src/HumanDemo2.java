/**  
 * @Title: HumanDemo2.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-9 ����04:36:54
 * @version V1.0  
 */

/**
 * @ClassName: HumanDemo2
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-9 ����04:36:54
 *
 */

class Human2{
	String name;
	String sex;
	int age;
	String addr;
	//�Զ��幹�캯��
	public Human2(String hName,String hSex,int hAge,String hAddr){
		name=hName;
		sex=hSex;
		age=hAge;
		addr=hAddr;
	}
	void work()
	{
		System.out.println("���ڹ���");
	}
	void eat()
	{
		System.out.println("���ڳԷ�");
	}
}

public class HumanDemo2 {
	public static void  main(String args[]) {
		//����2������
		Human2 zhangsan=new Human2("����","��",25,"�й�����");
//		Human lisi=new Human();
//		//��zhangsan��ֵ
//		zhangsan.name="����";
//		zhangsan.sex="��";
//		zhangsan.age=25;
//		zhangsan.addr="�й�����";
//		//��zhangsan��ֵ��lisi
//		lisi=zhangsan;
//		//��ӡ����ֵ��Ľ��
		System.out.println("������������"+zhangsan.name);
//		System.out.println("���ĵ�������"+lisi.name);
//		System.out.println("�ı����ĵ�����");
//		lisi.name="����";
//		System.out.println("����������������"+zhangsan.name);
//		System.out.println("�������ĵ�������"+lisi.name);
	}
}
