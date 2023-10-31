package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
//		Creating a game in which the user must guess a number chosen randomly between 1 and 100
//		Player will have 5 guesses to guess the random number
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int theRandomNumber = random.nextInt(100) + 1;
		
		int j = 5;
		
		int i, guess;
		
		for (i = 0; i < j; i++) {
		
			System.out.println("Choose a number between 1 and 100: ");
			guess = scanner.nextInt();
		
			if
				(theRandomNumber == guess) {
				System.out.println("You Win!");
				break;
			} else if 
				(theRandomNumber < guess && guess < 101) {
					System.out.println("Please pick a lower number");
			} else if
				(theRandomNumber > guess && guess > 0) {
					System.out.println("Please pick a higher number");
			} else {
				i = i - 1;
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			
		}
		
		if (i == j) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + theRandomNumber);
			}
		}
	}


