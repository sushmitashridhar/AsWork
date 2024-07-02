package com.kodnest.proj;

public class NotRepeatedAlphabets {
	public static void main(String[] args)
	{
		String str="poiuypo";
		char ch[]=new char[256];
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(ch[str.charAt(i)]==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		
	}

}
