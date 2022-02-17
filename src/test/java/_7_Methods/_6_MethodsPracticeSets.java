package _7_Methods;

public class _6_MethodsPracticeSets {
	//1.Write a Java method to print the multiplication table of a number n.
//	static void into(int n) {
//		int table;
//		for (int i=1;i<=10;i++) {
//			table = n*i;
//			System.out.println(table);
//		}
//	}
	
	//2.Write a program using functions to print the following pattern:
//	      *
//
//	     **
//
//	    ***
//
//	   ****
	
//	static void starup() {
//		for(int i = 0;i<=5;i++) {
//			for (int j=0;j<=i;j++) {
//				System.out.print("*");
//					}
//			System.out.println("");
//		}
//		
//		
//	}
	//3.Write a recursive function to calculate the sum of first n natural numbers.
//	static int sumrec(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n +sumrec(n-1);
//	}
	//4.Write a function to print the following pattern:
//    ****
//
//    ***
//
//    **
//
//    *
//	static void patternDown(int n) {
//		for(int i = 1;i<=5;i++) {
//			for (int j=5;j>=i;j--) {
//				System.out.print("*");
//					}
//			System.out.println("");
//		}
//		
//	}
	//5.Write a function to find the average of a set of numbers passed as arguments.
//	static void varags(int...args) {
//		int sum = 0;
//		for (int es:args) {
//			sum+=es;
//			
//			
//			
//		}
//		System.out.println(sum);
//		int avg = sum/args.length;
//		System.out.println("the avrage is : " + avg);
//	}
	//6.Write a function to convert Celsius temperature into Fahrenheit.
//	static void tempchange(double a) {
//		double farenhite = ((a*1.8)+32);
//		System.out.println(farenhite);
//		
//	}
	//7.Write a function to print the nth term of the Fibonacci series using recursion.
	//representation = 0,1,1,2,3,5,8,13,21,34
//	static int fib(int n) {
//		if(n==1||n==2) {
//			return (n-1);
//		}
//		else {
//			return fib(n-1) + fib(n-2);
//		}
//	}
	//8.Repeat problem 2 using Recursion.
//	static void patternrec(int n) {
//		if(n>0) {
//			patternrec(n-1);
//			for(int i =0;i<n;i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
    public static void main(String[] args) {
	
	//into(3);
    //starup();
//    	int c = sumrec(5);
//	System.out.println(c);
    	//patternDown(5);
    	//varags(5,6,7,8,9);
    	//tempchange(4);
//    	int c= fib(8);
//    	System.out.println(c);
    	//patternrec(5);
    	
}
}
