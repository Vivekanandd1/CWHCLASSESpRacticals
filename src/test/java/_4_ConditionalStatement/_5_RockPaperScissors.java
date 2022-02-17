package _4_ConditionalStatement;

import java.util.Random;
import java.util.Scanner;

public class _5_RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("Attention please! Now we are going  to play Rock Paper Scissor.");
        System.out.println("Please choose:-\n\t0 for Rock\n\t1 for Paper\n\t2 for Scissor");
		 Random random = new Random();
		 Scanner sc  = new Scanner(System.in);
		 System.out.println("pls enter number between 0 to 2");
		 int userinpt = sc.nextInt();
		 //int comopt = random.nextInt(1, 3);
		 switch (userinpt) {
		case 0:{System.out.println("you slected rock");}
		break;
		case 1:{System.out.println("you slected paper");}
		break;
		case 2:{System.out.println("you slected scissor");}
		break;
		}
		 System.out.println("its computer turn");
		 int comopt = random.nextInt(3);
		 switch(comopt) {
		case 0:{System.out.println("computer slected rock");}
		break;
		case 1:{System.out.println("computer slected paper");}
		break;
		case 2:{System.out.println("computer slected scissor");}
		break;
		 
		 }
		 
		 if (userinpt==comopt) {
			 System.out.println("match draw");
		 }
		 else if((userinpt==0 && comopt==2)||(userinpt==1 && comopt==0)||(userinpt==2 && comopt==1))
		 {
			 System.out.println("you won");
		 }
		 else
		 {
			 System.out.println("you lose! better luck next time");
		 }
	}
}
	
