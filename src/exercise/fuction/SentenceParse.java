package exercise.fuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author 		Irving Velazquez
 * @version 	1.0
 * @since 		09/15/2021
 * */

public class SentenceParse {
	
	/*
	 * Function that that parses a sentence and replaces each word with the following: 
	 * first letter, number of distinct characters between first and last character, and last letter. 
	 * @param string sentence
	 * @return parsed String
	 */
	public static String parseString(String input) {
		//Building the string
		StringBuffer st = new StringBuffer();
		
		//getting special characters
		String chars = input.replaceAll("[a-zA-Z0-9]", "");
		//split the characters and getting an array
		String[] charArray = chars.split("");

		//replacing spaces and special characters for a comma
		input = input.replaceAll("[^a-zA-Z0-9]", ",");
		
		
		//split the sentence and getting an array
		String[] array = input.split(",");
		
		//Converting the array to ArrayList
		ArrayList<String> words = new ArrayList<String>();
		Collections.addAll(words, array);
		
		//counter for the array of characters
		int i = 0;
		//Iterating the list of words
		for(String word: words) {
			
			//getting word length
			int length = word.length();
			
			//if word has more that one chars
			if(length > 1) {
				
				//getting first character
				char first = getFirstChar(word);
				//getting last character
				char last = getLastChar(word);
				//removing first and last character
				word = removeFirstandLast(word);
				
				//appending first letter
				st.append(first);
				
				//if word does not have any more letters
				if(word.length() == 0) {
					st.append(0);
				}else {//if has more letters
					//convert last letters to an array
					String[] letters = word.split("");
					//Converting the array to a Hash set
					HashSet<String> set = new HashSet<String>();
					Collections.addAll(set, letters);
					//appending the last letters size
					st.append(set.size());
				}
				
				//appending last character
				st.append(last);
			}else if(length <= 1) { //else if length has less than 2 chars
				//appending the simple word
				st.append(word);
			}
			if(i < charArray.length) {
				//appending character
				st.append(charArray[i]);
			}
			i++;
		}
		return st.toString();
	}
	
	/*
	 * Function to get the first character of a String 
	 * @param string word
	 * @return first char
	 */
	private static char getFirstChar(String word) {
	    return word.charAt(0);
	}
	
	/*
	 * Function to get the last character of a String 
	 * @param string word
	 * @return last char
	 */
	private static char getLastChar(String word) {
	    return word.charAt(word.length() - 1);
	}
	
	/*
	 * Function to remove the last and first character of a String 
	 * @param string word
	 * @return string
	 */
	private static String removeFirstandLast(String word)
    {
        return word.substring(1, word.length() - 1);
    }
	
	
}
