package _4_ConditionalStatement;

import java.util.Scanner;

public class _3_IfElseIFLadder {
	
	public static void main(String[] args) {
		System.out.println("pls enter speed = ");
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		
		if (speed>90)
		{
			System.out.println("you are overspeeding");
		}
		else if (speed>80) {
			System.out.println("you are going to fasst");
			
		}
		else if (speed>70) {
			System.out.println("you have to calm down");
			
			
		}
		else {
			System.out.println("you are good rider");
		}
	}

}
