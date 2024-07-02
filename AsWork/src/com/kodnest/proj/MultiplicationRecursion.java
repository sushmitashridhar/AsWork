package com.kodnest.proj;

public class MultiplicationRecursion {
	public static void main(String[] args)
	{
		int n=8;
		mul(n,1);
	}
	static void mul(int n,int i)
	{
		if(i>10)
		{
			return;
		}
		System.out.println(n+"*"+i+"="+n*i);
		mul(n,i+1);
	}

}
