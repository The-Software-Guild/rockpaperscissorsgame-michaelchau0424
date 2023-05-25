package assignments.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rps = {"Rock", "Paper", "Scissors"};
		
		int input;
		int rounds;
		int compChoice;
		String playAgain;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int wins = 0;
			int ties = 0;
			int losses = 0;
			
			System.out.println("How many rounds would you like to play? (1-10)");
			
			
			rounds = Integer.parseInt(sc.nextLine());
			if(rounds > 10 || rounds < 0) {
				System.out.println("Invalid number of rounds. Rounds must be between 1 and 10 inclusive.");	
			}
			
			for(int i = 0; i < rounds; i++) {
				System.out.println("Would you like to play:\n    1.Rock\n    2.Paper\n    3.Scissors");
				input = Integer.parseInt(sc.nextLine());
				Random rn = new Random();
				compChoice = rn.nextInt(3) + 1;
				
				System.out.println("You have chosen " + rps[input-1]);
				System.out.println("Computer has chosen " + rps[compChoice-1]+"\n");
				
				if(compChoice > input) {
					if(compChoice == 3 && input == 1) {
						System.out.println("You win. "+ rps[compChoice-1]+" beats "+ rps[input-1]);
						wins++;
					} else {
						System.out.println("Computer win. "+ rps[compChoice-1]+" beats "+ rps[input-1]);
						losses++;
					}
					
				} else if(input > compChoice) {
					if(input == 3 && compChoice == 1) {
						System.out.println("Computer win. "+ rps[compChoice-1]+" beats "+ rps[input-1]);
						losses++;
					} else {
						System.out.println("You win. "+ rps[compChoice-1]+" beats "+ rps[input-1]);
						wins++;
					}
					
				} else {
					System.out.println("Tie. Both players played "+rps[input-1]);
					ties++;
				}
				System.out.println("");
			}
			System.out.println(String.format("Wins: %o \nLosses: %o \nTies: %o", wins,losses,ties));
			
			if(wins > losses) {
				System.out.println("You win!");
			} else if(losses > wins) {
				System.out.println("You lose!");
			} else {
				System.out.println("Its a tie!");
			}
			System.out.println("\nWould you like to play again? (y/n)");
			playAgain = sc.nextLine();
			if(playAgain.equals("n")) {
				System.out.println("Thanks for playing!");
				break;
			}
			System.out.println("--------------------------------------------------\n");
		}
		
		
		
		
		
		
	}

}
