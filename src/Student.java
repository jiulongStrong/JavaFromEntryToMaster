/**  
 * @Title: Student.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Strong 805267636@qq.com  
 * @date 2016-5-10 上午10:01:05
 * @version V1.0  
 */

/**
 * @ClassName: Student
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Strong 805267636@qq.com
 * @date 2016-5-10 上午10:01:05
 *
 */
public class Student {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args    设定文件
	 * @return void    返回类型
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
		// TODO 自动生成的方法存根
		Student s1=new Student(1000);
		Student s2=new Student(1001);
		Student s3=new Student(1002);
		System.out.println("s1的学号"+s1.id);
		System.out.println("s2的学号"+s2.id);
		System.out.println("s3的学号"+s3.id);
		System.out.println("学生的数目"+Student.studentNum);
	}

}
