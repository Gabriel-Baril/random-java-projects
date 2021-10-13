package com.tawin;

public class Main {
	public static int BinaryToDecimal(String data){
		if(!data.matches("^[0-1]+$"))
			return 0;
		
		int output = 0;
		
		int len = data.length();
		
		for(int i = 0;i < len;i++){
			output += Integer.parseInt("" + data.charAt(i))*Math.pow(2, len - i - 1);
		}
		
		return output;
	}
	
	public static void main(String args[]){
		int a = ~37;
		
		System.out.println(BinaryToDecimal("01011010"));
		System.out.println(a);
	}
}
