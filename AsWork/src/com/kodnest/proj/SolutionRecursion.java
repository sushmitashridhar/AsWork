package com.kodnest.proj;

public class SolutionRecursion {
	public static void main(String[] args)
	{
		display(1);
	}
	static void display(int a)
	{
		System.out.println("Hello");
		a++;
		if(a<=5)
			display(a);
	}
}

