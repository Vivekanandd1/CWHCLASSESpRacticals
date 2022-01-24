package _1_Variables;

import java.util.Scanner;

public class _4_SubjectPercentage {

	public static void main(String[] args) {
		
		System.out.println("here we are getting the percentage of a student who got below number in that subject and percentage in that clss");
		System.out.println("please enter the marks in english");
		float total = 500;
		Scanner sc = new Scanner(System.in);
		float English = sc.nextFloat();
		System.out.println(English);
		
		System.out.println("please enter the marks in Maths");
		float Maths = sc.nextFloat();
		System.out.println(Maths);
		
		System.out.println("please enter the marks in Science");
		float Science = sc.nextFloat();
		System.out.println(Science);
		
		System.out.println("please enter the marks in Hindi");
		float Hindi = sc.nextFloat();
		System.out.println(Hindi);
		
		System.out.println("please enter the marks in Physics");
		float Physics = sc.nextFloat();
		System.out.println(Physics);
		
		float sum = English+Maths+Science+Hindi+Physics;
		System.out.println("you got " +sum +  "out of 500");
		
        float Perncentage = (sum/total)*100;
		
		System.out.println("your percentage is " + Perncentage);
	}
}
