package xyz;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	String check = "y";
    boolean keepPlaying = true;

	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		int lives = 5;
		
		
		while(game.keepPlaying) {
			
		int randomNum = game.random.nextInt(16);	
		System.out.println("Welcome to the guessing game!");
		System.out.println("Okay, i'm thinking of a number between 0 & 15, you have only 5 tires! What's the number?");
		int guess = game.scan.nextInt();
		for(int i = 1; i < lives; i++) {
			if(guess < randomNum) {
				System.out.println("Guess higher!");
				guess = game.scan.nextInt();
			}	
			else if (guess > randomNum) {  
				System.out.println("Guess lower!");
				guess = game.scan.nextInt();
			}
			else if(guess == randomNum) {
				System.out.println("Congratulations!! You got it right");
				break;
			}	
		}
		if(guess != randomNum) {
			System.out.println("Game Over.. :(");
			}
		
		if( guess != randomNum || guess == randomNum ) {
			game.playAgain();
			}
		}
		
	}
		
		
		
		
	
	public void playAgain() {
		String play;
		
		System.out.println("Do you want to play again? Input 'y' or 'n' ");
		play = scan.next();
		
		if(play.equals(check)) {
			keepPlaying = true;
		}else {
			System.out.println("Bye!!");
			keepPlaying = false;
		}
		
	}
	
	
	
	
	
	
	
}
