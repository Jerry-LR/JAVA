package come.jerry.fengzhuang;

public class TestFZ extends StudentFZ
{
	public static void main(String[] args) {
		StudentFZ sfz=new StudentFZ();
		sfz.setNameIdCardSexAge("张三", "N022", "男生", 18);
		String a=sfz.getName();
		String b=sfz.getIdCard();
		String c=sfz.getSex();
		int d=sfz.getAge();
		System.out.println("姓名："+a+" "+"学号："+" "+b+" "+"性别："+c+" "+"年龄:"+d);
		sfz.StudentFZ();
		
	}

}
