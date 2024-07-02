package com.kodnest.proj;

public class DisplayFirstChar {
	public static void main(String[] args) {
		String str="Program";
		for(int i=0;i<str.length();i++)
		{
			String ch=str.charAt(i)+"";
			if(str.substring(i+1).contains(ch))
			{
				continue;
			} 
			else{
				System.out.println(ch);
				break;
			}
			
		}
	}
}
