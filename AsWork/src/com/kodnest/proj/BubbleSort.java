package com.kodnest.proj;
//import java.util.Scanner;

public class BubbleSort {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		//Scanner scan=new Scanner(System.in);
		//System.out.println("enter the size of an array;");
		//int n=scan.nextInt();
		int arr[]={7,8,3,2,1};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;i<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		printArray(arr);
		//System.out.println("the descending order is:");
	//	for(int i=0;i<a.length;i++)
	//	{
		//	System.out.println(a[i]+" ");
	//	}
	}

}
