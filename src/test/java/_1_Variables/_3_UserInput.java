package _1_Variables;

import java.util.Scanner;

public class _3_UserInput {
	
	public static void main(String[] args) {
		
		System.out.println("taking input from user");
		Scanner sc = new Scanner(System.in);//Creating an object named "sc" of the Scanner class.
		//Scanner S = new Scanner(System.in);  //(Read from the keyboard)
		System.out.println("enter number one");
		int a = sc.nextInt();  //(Method to read from the keyboard)
		System.out.println("enter number two");
		int b = sc.nextInt();
		System.out.println("enter number three");
		int c = sc.nextInt();
		int sum =a+b+c;
		
		System.out.println("the total of all three is="+sum);
		
	}

}
