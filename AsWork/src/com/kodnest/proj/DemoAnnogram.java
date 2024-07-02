package com.kodnest.proj;

import java.util.Arrays;

public class DemoAnnogram {
	public static void main(String[] args)

	{
		String s1="listen";//"eilnst";
		String s2="silent";//"eilnst";
		char[] charArray1=s1.toCharArray();
		char[] charArray2=s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		String string1=new String(charArray1);
		String string2=new String(charArray2);
		if(string1.equalsIgnoreCase(string2))
		{
			System.out.println("anagrams");
		}else
		{
			System.out.println("Not anagrams");
		}
		

	}
}
