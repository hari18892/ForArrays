package com.CollectionsPack;

import java.util.HashMap;

/*Symbol    Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/
public class RomanToInteger {

	public static int romToint(String s){
		int result = 0;
		int previous = 0;
		
		HashMap<Character,Integer> romanValue = new HashMap();
		romanValue.put('I',1);
		romanValue.put('V',5);
		romanValue.put('X',10);
		romanValue.put('L',50);
		romanValue.put('C',100);
		romanValue.put('D',500);
		romanValue.put('M',1000);
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			int currentValue = romanValue.get(s.charAt(i));
			if(currentValue<previous)
			{
				result = result - currentValue;
			}else 
			{
				result = result + currentValue;
			}
			previous = currentValue;
		}
		return result;
		
	}
	public static void main(String[] args) {
		String value = "XXIV";
        int result = romToint(value);
        System.out.println("The integer value of " +value  + " is " + result);

	}

}
