/**  
 * @Title: Student.java
 * @Package 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 ����10:01:05
 * @version V1.0  
 */

/**
 * @ClassName: Student
 * @Description: TODO(������һ�仰��������������)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 ����10:01:05
 *
 */
public class Student {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	
	int id=0;
	static int studentNum=0;
	Student(int x)
	{
		id=x;
		studentNum++;
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student s1=new Student(1000);
		Student s2=new Student(1001);
		Student s3=new Student(1002);
		System.out.println("s1��ѧ��"+s1.id);
		System.out.println("s2��ѧ��"+s2.id);
		System.out.println("s3��ѧ��"+s3.id);
		System.out.println("ѧ������Ŀ"+Student.studentNum);
	}

}
