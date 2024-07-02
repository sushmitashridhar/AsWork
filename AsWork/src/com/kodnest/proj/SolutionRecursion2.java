package com.kodnest.proj;

public class SolutionRecursion2 {
	public static void main(String[] args)
	{
		display(5);
	}
	static void display(int a)
	{
		System.out.println("Hello");
		a--;
		if(a>=1)
			display(a);
	}
}
