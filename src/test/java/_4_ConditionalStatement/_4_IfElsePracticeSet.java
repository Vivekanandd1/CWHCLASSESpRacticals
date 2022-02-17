package _4_ConditionalStatement;

import java.util.Scanner;

public class _4_IfElsePracticeSet {
	
	public static void main(String[] args) {
		 //1.what will be the output of this programm
		/*int a = 10;
		if(a =11) // it will throw a error as we have to use comparison opertor to make if block executable
		{
			System.out.println("this is true");
		}
		else
		{
			System.out.println("this is false");
		}*/
		//2.getting user input for checking a student got desired makrs and percentage to qualify to requirements
		
		/*Scanner sc = new Scanner(System.in);
		
		int PassingMarks = 40;
		int SubjectMark = 33;
		System.out.println("pls enter marks for physics");
		int Physics = sc.nextInt();
		System.out.println("pls enter marks for maths");
		int maths = sc.nextInt();
		System.out.println("pls enter marks for english");
		int English = sc.nextInt();
		
		float total_marks = (Physics+maths+English)/3.0f;
		if(total_marks>=40 && Physics>=33 && maths>=33 && English>=33)
		{
			System.out.println("you are pass");
		}
		else {
			System.out.println("not you are not");
		}*/
		//3.Calculating incomeTax on a individual Income
		
		/*Scanner sc = new Scanner(System.in);
		float tax = 0;
		System.out.println("enter in you income in Laks per annum");
		float income = sc.nextFloat();
		if(income<=2.5) {
			tax = tax + 0;
		}
		else if(income>=2.5 && income<=5f)
		{
			tax = tax + 0.05f*(income-2.5f);
		}
		else if(income>=5f && income<=10f) {
			tax = tax + 0.05f*(5f-2.5f);
			tax = tax + 0.2f*(income-5f);
		}
		else if(income>=10) {
			tax = tax + 0.05f*(5f-2.5f);
			tax = tax + 0.2f*(income-5f);
		    tax = tax + 0.3f*(income-10f);
		}
		System.out.println("tax need to pay by you is = " +tax);*/
		
		//4. Getting day name by there index arrival
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter day id");
		int day  = sc.nextInt();
		switch (day) {
		case 1:
		{
			System.out.println("moday");
			break;
		}
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thrusday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		case 7:
		{
			System.out.println("sunday");
			break;
		}
		
		}*/
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("pls enter website name");
		String Website = sc.next();
		if (Website.endsWith(".org")) {
			System.out.println("it orgnizational website");
			
		}
		else if(Website.endsWith(".com")) {
			System.out.println("this is commercial website");
			
		}
		
		else if(Website.endsWith(".in")) {
			System.out.println("this is indian website");
		}
	}

}
