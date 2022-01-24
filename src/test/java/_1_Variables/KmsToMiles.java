package _1_Variables;

import java.util.Scanner;

public class KmsToMiles {
	
	public static void main(String[] args) {
		
		System.out.println("pls enter kilometers");
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double c = 0.621371;
		 System.out.println("this will be " + a*c + " miles");
		
		
	}

}
