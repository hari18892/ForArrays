package com.CollectionsPack;

import java.util.Arrays;

public class PrefixLongest {
	
	public String longestPrefix(String[] strs) {
		
		Arrays.sort(strs);
		String str1=strs[0];
		String str2=strs[strs.length-1];
		int index=0;
		while(index<str1.length()) 
		{
			if(str1.charAt(index)==str2.charAt(index)) 
			{
				index++;
			}
			else 
			{
				break;
			}
		}
		return index==0?"":str1.substring(0, index);
		
	}
	
	public static void main(String[] args) {
		String[] strs = {"Race","flow","Dog"};
		String[] strss = {"dog","racecar","car"};
		System.out.println((new PrefixLongest().longestPrefix(strs)));
		System.out.println((new PrefixLongest().longestPrefix(strss)));
	}

}
