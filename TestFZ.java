package come.jerry.fengzhuang;

public class TestFZ extends StudentFZ
{
	public static void main(String[] args) {
		StudentFZ sfz=new StudentFZ();
		sfz.setNameIdCardSexAge("����", "N022", "����", 18);
		String a=sfz.getName();
		String b=sfz.getIdCard();
		String c=sfz.getSex();
		int d=sfz.getAge();
		System.out.println("������"+a+" "+"ѧ�ţ�"+" "+b+" "+"�Ա�"+c+" "+"����:"+d);
		sfz.StudentFZ();
		
	}

}
