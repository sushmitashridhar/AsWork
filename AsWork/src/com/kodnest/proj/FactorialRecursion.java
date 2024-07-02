//WAJP to find factorial of a given number using recursion.

package com.kodnest.proj;
public class FactorialRecursion {
	private static int count;
	public static void main(String[] args)
	{
		//Scanner scan=new Scanner(System.in);
		int n=3;
		fact(n);
		int count=0;

	}
	static int fact(int n)
	{
		System.out.println(count);
		if(n==0)
		{
			return 1;
		}else {
		count++;
		return n*fact(n-1);
	}
	}
}


















/*
package com.kodnest.proj;
//import java.util.Scanner;
public class FactorialRecursion {
	public static void main(String[] args)
	{
		//Scanner scan=new Scanner(System.in);
		
		System.out.println(fact(5));

	}
	static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}

}
*/
