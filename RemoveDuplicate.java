package com.CollectionsPack;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void dupliacateEle(int duplicate[][])
	{
		int rows = duplicate.length;
		int colum = 0;
		
		for(int i=0;i<rows;i++) 
		{
			colum = duplicate[i].length;
			for(int j=0;j<colum;j++) 
			{
				for(int a=i;a<rows;a++)
				{
					int start = (a==i)?j+1:0;
					colum = duplicate[a].length;
					
					for(int b=start;b<colum;b++)
					{
							
						if(duplicate[i][j] == duplicate[a][b]) 
						{
							duplicate[a][b] = 0;
						}
					}
				}
				colum = duplicate[i].length;
			}
		}
		
		System.out.println("OutPut:");
		for(int[] value : duplicate) 
		{
			System.out.println(Arrays.toString(value));
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int[][] value = {{2,4,6},{3,2,3},{4,2,1}};
		dupliacateEle(value);	
	}
	

}
