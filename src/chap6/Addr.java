package chap6;

public class Addr implements Cloneable {
	String country;
	String province;
	String city;
	
	public Addr(String country,String province,String city) {
		this.country=country;
		this.province=province;
		this.city=city;
	}
	
	//克隆方法
	public Object clone() {
		Addr addr=null;
		try {
			addr=(Addr)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return addr;
	}
}
