package come.jerry.fengzhuang;

public class StudentFZ {
	public  String name;
	private String idCard;
	private String sex;
	private int age;
	public StudentFZ() {}
	public void setNameIdCardSexAge(String name,String idCard,String sex,int age) {
		this.name=name;
		this.age=age;
		this.idCard=idCard;
		this.sex=sex;
		}
	public String getName()
	{
		return name;
	}
	public String getIdCard()
	{
		return idCard;
		
	}
	public String getSex()
	{
		return sex;
		
	}
	public int getAge()
	{
		return age;
		
	}
	public void StudentFZ() {
		System.out.println("姓名："+name+" "+"学号："+" "+idCard+" "+"性别："+sex+" "+"年龄:"+age);
	}
	

}
