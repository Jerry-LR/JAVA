package com.jerry.jiekou;

public  class TestJK implements Print,Cin{
	public static String name;
	//��̬��
	static class Jingtai{
		public Jingtai() {}
		public static void Jingtai() {
			System.out.println("jingtai");
		}
	}
	//����
	public void niming()
	{
		Print print=new Print() {
			@Override
			public void Print() {
				// TODO Auto-generated method stub
				System.out.println("����");
			}
		};
		print.Print();
		
	}
	
	@Override
	public void Cin() {
		// TODO Auto-generated method stub
		System.out.println("dsadsadsa");
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("aDSAdsdsadssadsadsad");
	}
	public  TestJK() {}
	public void testJK() {
		System.out.println("hahahah");
		
	}
	//�ⲿ��
	class WaiBu{
		public void WaiBu() {
			System.out.println("waibu");
		}
	}
	//�ڲ���
	public void Neibu()
	{
		class Neibulei{
			public void neibulei() {
				System.out.println("neibu");
			}
		}
		Neibulei neibu=new Neibulei();
		neibu.neibulei();	}
	
	
	

}
