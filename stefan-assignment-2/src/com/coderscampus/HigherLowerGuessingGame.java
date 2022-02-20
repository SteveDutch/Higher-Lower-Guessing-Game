package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		int theRandomNumber = random.nextInt(101);
		boolean lost = true;
		
		int i =1;
		while (i <=5) {
			int checkGuess =pickANumber();
			if (checkGuess <1 || checkGuess >100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				// checkGuess = pickANumber();
				
			}
		
			
			else if (checkGuess < theRandomNumber) {
				System.out.println("Please pick a higher number");
				i++;
			} else if (checkGuess > theRandomNumber) {
				System.out.println("Please pick a lower number");
				i++;
			} else if (checkGuess == theRandomNumber) {
				System.out.println("You win!");
				i =6;
				lost = false; 
			
			}
		}
		
		if (lost == true) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + theRandomNumber);
			
			
		}
		

	}

	public static int pickANumber() {
		System.out.println("Pick a number between 1 and 100");
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();
		int pickedNumber = Integer.parseInt(input);
		// Das gehört zur Schleife
		/*
		 * if (pickedNumber <1 || pickedNumber >100) {
		 * System.out.println("Your guess is not between 1 and 100, please try again");
		 * pickANumber();
		 * 
		 * }
		 */
		return pickedNumber;
		
	}

}
