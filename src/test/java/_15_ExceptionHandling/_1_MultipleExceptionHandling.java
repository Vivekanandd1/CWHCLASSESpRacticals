package _15_ExceptionHandling;

import java.util.Scanner;

public class _1_MultipleExceptionHandling {
	public static void main(String[] args) {
		int[] marks = new int[3];
		marks[0] = 92;
		marks[1] = 45;
		marks[2] = 72;
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter array index number");
		int ind = sc.nextInt();
		System.out.println("pls enter the number for divide");
		int number =sc.nextInt();
		try {
			System.out.println("at index num the value is " + marks[ind]);
			System.out.println("the divsion of that array is "  + marks[ind]/number);
			}
		catch(Exception e) {
			System.out.println("the exception is "+e);
		}
	}

}
