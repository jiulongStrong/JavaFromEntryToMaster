package chap6;
public class SonClass extends FatherClass {
	void print()
	{
		SonClass son=new SonClass();
		System.out.println("在子类的方法中：");
		System.out.println(son.str3);
	}
}
