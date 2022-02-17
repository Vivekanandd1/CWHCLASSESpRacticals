package _5_Loops;

public class _6_PracticeSet {
	public static void main(String[] args) {
		//1. Star Pattern
//		int n=5;
//	   for (int i=n;i>0;i--)
//     	{
//			for (int j=0;j<i;j++)
//		{
//			System.out.print("*");
//	 	}
//		System.out.println("\n");
//		}
		
		
		//2.Write a program to print the multiplication table of a given number n.
//		int n = 2;
//		for (int i=1 ;i<=10;i++) {
//			System.out.printf( "%d X %d = %d \n", n,i,n*i);
//		}
		
		//3.Write a program to sum first n even numbers using a while loop.
//		int sum=0;
//		int n = 0;
//		 while(n<4) {
//			sum = sum+2*n;	
//			n++;
//		}
//		System.out.println(sum);
		
		//4.Write a program to print a multiplication table of 10 in reverse order.
//		int n = 2;
//		for (int i =10;i>=0;i--) {
//			System.out.printf("%d X %d = %d \n" , n ,i, n*i);
//		}
		
		//5.Write a program to find the factorial of a given number using for loops.
//		int n = 5;
//		int factorial = 1;
//		for (int i=5;i>0;i--) {
//			factorial = factorial*i;
//		
//		}
//		System.out.println(factorial);
//		
		//6.Repeat problem 5 using a while loop.
//		int n =5;
//		int factorial = 1;
//		while(n>0) {
//			factorial = factorial*n;
//			n--;
//		}
//		
//		System.out.println(factorial);
		
		//7.Repeat problem 1 using for/while loop.
		/*int row = 5,i=1,j=1;
		while(i<row) {//1 is less than 5
			while(j<i){//here condition not matching so it will skpi this loop
				System.out.print("*");
				j++;
			}
			System.out.println("*");//as 1 is less than 5 it will print *
			i++;//now i got updated by 1 and beacme 2
			j = 1;*/
		
		//8 .Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
//		int n = 8,sum = 0;
//		
//		for (int i=1;i<=10;i++) {
//			sum = sum +n*i;
//		}
//		System.out.println(sum);
//		
		//9. Write a program to sum first n even numbers using a for loop.
		int sum = 0;
		for (int i=0;i<=5;i++) {
			sum = sum + 2*i;
			System.out.println(sum);
		}
		System.out.println("the sum is = "+sum);
		}
	}
		


