package com.zdkj.shuzu;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ShuZu {

	public static void main(String[] args) {
		int[] a;
		a=new int[3];
		a[0]=3;
		System.out.println("a[0]"+"="+a[0]);
		int b[]= {0,10,20,30};
		System.out.println("b[1]"+"="+b[1]);
		int c[]=new int[] {0,1,2,3};
		System.out.println("c[2]"+"="+c[2]);
		String d[]=new String[6];
		d[5]="lalaladlkadlsdksahgfsahahdasdksahhdkshdhdkhadkjsgfgsahsadsahdksahfgsgkadhadhadhadjsahdkjsa";
		System.out.println(d[5]);
		for(int i=0;i<4;i++)
		{
			System.out.println(c[i]);
		}
		for(int j:b)
		{
			System.out.println(j);
		}
		
	}

}
