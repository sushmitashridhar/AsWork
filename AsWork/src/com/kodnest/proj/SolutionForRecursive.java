package com.kodnest.proj;

public class SolutionForRecursive {
	public static void main(String[] args)
	{
		display(1);
	}
	static void display(int a)
	{
		System.out.println("Hello");
		if(a==5)
			return;
		else
			display(++a);
	}
}
