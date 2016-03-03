package org.airofbengal.math;

public class MathA{
	public static int[] ROMAN_NUMS = new int[24];
	static{
		ROMAN_NUMS['I'-65] = 1;
		ROMAN_NUMS['V'-65] = 5;
		ROMAN_NUMS['X'-65] = 10;
		ROMAN_NUMS['L'-65] = 50;
		ROMAN_NUMS['C'-65] = 100;
		ROMAN_NUMS['D'-65] = 500;
		ROMAN_NUMS['M'-65] = 1000;
	}

	// Calculate the given intneger is squared numbered or not!
	public static boolean isSquared(long n){
		double d = Math.sqrt(n);
		long l = (long)Math.floor(d);
		if(l*l == n) return true;
		return false;
	}
	

	// Roman numeral: Any of the letters representing numbers in the Roman numerical system: I=1,V=5,X=10,L=50,C=100,D=500,M=1000.
	// In this system a letter placed after another of greater value adds (thus XVI or xvi is 16), 
	// whereas a letter placed before another of greater value subtracts (thus XC is 90).
	// NOTE: To get decimal number from this function, iterate from right to left of the given roman numerals.
	public static String romanToDec(String roman){
		if(roman == null || roman.equals("")){
			return "Invalid Input!";
		}

		int len = roman.length();		

		roman = roman.toUpperCase();

		char prevChar = roman.charAt(len-1);

		if(roman.length() == 1)
			return String.valueOf(ROMAN_NUMS[prevChar-65]);
		
		Long dec = Long.valueOf(ROMAN_NUMS[prevChar-65]);
		for(int i = roman.length()-2;i>=0;i--){
			char currChar = roman.charAt(i);
			if(ROMAN_NUMS[currChar-65] < ROMAN_NUMS[prevChar-65]){
				dec -= ROMAN_NUMS[currChar-65];
			}else {
				dec += ROMAN_NUMS[currChar-65];
			}
			prevChar = currChar;
		}

		return dec.toString();
	}

	public static String decToRoman(Long dec){
		return null;
	}
	
}