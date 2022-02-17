package _7_Methods;

import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    
    Game()//Genrating the Random number from Computer side
    {
    	Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    
  void takeUserInput(){//for taking user input on asking again and again we are making constructor here
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){//comparing userinput and computer number
        noOfGuesses++;
        if (inputNumber==number)//Condition to validate till it get satisfied
        {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class _2_GuessTheGame {
	public static void main(String[] args) {
		Game Gm = new Game();
		boolean b= false;
        while(!b){
        Gm.takeUserInput();
        b = Gm.isCorrectNumber();
        }

	}

}
