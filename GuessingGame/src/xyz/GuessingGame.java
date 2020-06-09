package xyz;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int lives = 3;
		
		System.out.println("Welcome to the guessing game!, please enter the range of numbers you want guess from");
		int range = scan.nextInt();
		int randomNum = random.nextInt(range);
		
		System.out.printf("Okay, i'm thinking of a number between 0 & %d, you have only 3 lives! What's the number?\n", range);
		int guess = scan.nextInt();
		for(int i = 1; i < lives; i++) {
			if(guess != randomNum) {
				System.out.println("Try again");
				guess = scan.nextInt();
			}
			else
				System.out.printf("Congratulations!, you got it right the number was %d", randomNum);
			
			}
		System.out.println("Game Over.. :(");

	}

}
