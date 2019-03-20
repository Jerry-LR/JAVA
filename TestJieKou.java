package com.jerry.jiekou;

public abstract class TestJieKou implements Print,Cin{

	
	public static void main(String[] args) {
		TestJK print=new TestJK();
		print.Cin();
		print.Print();
		print.testJK();
		TestJK.WaiBu waibu=print.new WaiBu();
		waibu.WaiBu();
		print.Neibu();
		TestJK.Jingtai.Jingtai();
		print.niming();
		
		
	
	
}



	
}		

