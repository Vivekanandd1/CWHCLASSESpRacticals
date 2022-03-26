package _15_ExceptionHandling;

import java.util.Scanner;

class ManyAttempt extends Exception{
	public String toString() {
		return "toooo many attempts";
	}
}

public class _5_UserInputOnTryCatch {
	public static void arr() throws ManyAttempt {
		int[] marks = new int[3];
		marks[0]=83;
		marks[1]=93;
		marks[2]=73;
		boolean flag = true;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(flag && i<5) {
			try {
				System.out.println("Enter a valid index");
				int index = sc.nextInt();
				System.out.println("the value at this index is :"+ marks[index]);
				break;
			}
			catch(Exception e) {
				System.out.println("Invalid index");
				i++;
			}
			if(i>=5) {
				System.out.println("Error");
				throw new ManyAttempt();
				
			}
		
	}
	}
	public static void main(String[] args)  {
		try {
			arr();
		}
		catch(Exception e) {
			System.out.println("this is exception");
			System.out.println(e);
		}
	}
}


