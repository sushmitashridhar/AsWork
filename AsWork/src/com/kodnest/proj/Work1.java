//import java.util.Scanner;
package com.kodnest.proj;
import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        int num = scanner.nextInt();

	        if (isOddAndPositive(num)) {

	            System.out.println("The number is both odd and positive.");

	        } else {

	            System.out.println("The number is either even or not positive.");

	        }

	    }

	    public static boolean isOddAndPositive(int num) {

	        return (num > 0) && (num % 2 != 0);

	    }

	}
	
	
	
	
	
	
	
	
	/*
	
	//////////////////////
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        double weight = scanner.nextDouble();

	        int age = scanner.nextInt();

	        // Check eligibility for blood donation

	        boolean isEligible = (weight > 50) && (age > 18);

	        // Display the eligibility status

	        if (isEligible) {

	            System.out.println("You are eligible for blood donation.");

	        } else {

	            System.out.println("You are not eligible for blood donation.");

	        }

	    }

	}
	
	
	
	/////////
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a character: ");

	        char inputChar = scanner.next().charAt(0);

	        if (inputChar == '$') {

	            System.out.println("The entered character is '$'");

	        } else {

	            System.out.println("The entered character is not '$'");

	        }

	    }

	}
	
	
	/////////////////////////
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);

	    	char ch= scanner.next().charAt(0);

	    	if((ch >= 'a') && (ch <= 'b')) {

	    		System.out.println("Lower case letter");

	    	}

	    	System.out.println("end");

	    }

	}


	
//	/////////////////////////////////
	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);

	    	int num = scanner.nextInt();

	    	if(num==0) {

	    		System.out.println("Number is zero");

	    	}

	    	System.out.println("end");

	    }

	}
	
	*/
