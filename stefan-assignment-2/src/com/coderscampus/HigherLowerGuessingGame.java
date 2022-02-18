package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		int theRandomNumber = random.nextInt(101);
		boolean lost = true;
		
		pickANumber(); 

	}

	private static int pickANumber() {
		System.out.println("Pick a number between 1 and 100");
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();
		int pickedNumber = Integer.parseInt(input);
		if (pickedNumber <1 || pickedNumber >100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			pickANumber();
			
		}
		return pickedNumber;
	}

}
