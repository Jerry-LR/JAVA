package com.zdkj.shuzu;

public class DuoWeiShuZu {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		int[] b[]= {{1,2,3,4,},{1}};
		int [][]c=new int [][] {{1},{2},{},{1}};
		int d[][][]= {{{1,2,3,7},{2}},{{}}};
		int e[][][]=new int [2][3][4];
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e[i].length;j++)
			{
				for(int k=0;k<e[i][j].length;k++)
				System.out.print(e[i][j][k]+" ");
			}
		}
	}

}
