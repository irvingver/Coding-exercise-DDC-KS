package exercise.main;

import java.util.Scanner;

import exercise.fuction.SentenceParse;

/**
 * @author 		Irving Velazquez
 * @version 	1.0
 * @since 		09/15/2021
 * */

/*
 * Simple coding exercise: 
 * In the programming language of your choice, 
 * write a program that parses a sentence and 
 * replaces each word with the following: 
 * first letter, number of distinct characters between first and last character, 
 * and last letter.  
 * Words are separated by spaces or non-alphabetic characters and these separators 
 * should be maintained in their original form and location in the answer.  
 */
public class Main {

	public static void main(String args[]) {
		// Using Scanner for Getting Input from User
		System.out.println("Insert input to be parsed:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println("Input: " + input);
        String output = SentenceParse.parseString(input);
        System.out.println("Output: " + output);
        
        in.close();
	}
}
