package _15_ExceptionHandling;

import java.util.Scanner;

public class _2_NestedTryCatchBlocks {
	public static void main(String[] args) {
		int[] marks = new int[3];
		marks[0] = 92;
		marks[1] = 45;
		marks[2] = 72;
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter array index number");
		int ind = sc.nextInt();
	
		try {
			System.out.println("we ar starting from here");
			try {
				System.out.println("at index num the value is " + marks[ind]);
				
				}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("the exception is "+e);
			}
		}
		catch(Exception e) {
			System.out.println("here is exception :" +e);
		}
		
		
	}

}
