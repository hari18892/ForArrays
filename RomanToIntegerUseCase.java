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
public class RomanToIntegerUseCase {

	public static int romToint(String s){
		
	        int ans = 0, num = 0;
	        for (int i = s.length()-1; i >= 0; i--) {
	            switch(s.charAt(i)) {
	                case 'I': num = 1; break;
	                case 'V': num = 5; break;
	                case 'X': num = 10; break;
	                case 'L': num = 50; break;
	                case 'C': num = 100; break;
	                case 'D': num = 500; break;
	                case 'M': num = 1000; break;
	            }
	            if (4 * num < ans) ans -= num;
	            else ans += num;
	        }
	        return ans;
	    }
		
	public static void main(String[] args) {
		String value = "XXIV";
        int result = romToint(value);
        System.out.println("The integer value of " +value  + " is " + result);

	}

}
