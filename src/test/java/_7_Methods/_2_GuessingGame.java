package _7_Methods;

import java.util.Random;
import java.util.Scanner;

class Games{
	int userinput;
	int number;
	int attempts = 0;
	
	Games(){
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	
	public void Userinpt() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		userinput = sc.nextInt();
	}
	
	boolean isnumcorrect() {
		attempts++;
		if(userinput==number) {
			System.out.printf("yes this is the number %d and you guessed it in %d attempts  ", number,attempts);
			return true;
		}
		else if(userinput>number) {
			System.out.println("too high!!!!!!.........");
		}
		
		else if(userinput<number) {
			System.out.println("too low !!!!.....");
		}
		return false;
	}
	
	
}
public class _2_GuessingGame {
	public static void main(String[] args) {
		Games G = new Games();
		boolean b = false;
		while(!b) {
			G.Userinpt();
			b = G.isnumcorrect();
		}
	}

}
