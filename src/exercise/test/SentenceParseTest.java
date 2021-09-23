package exercise.test;

/**
 * @author 		Irving Velazquez
 * @version 	1.0
 * @since 		09/15/2021
 * */

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exercise.fuction.SentenceParse;



/* Test class for SentenceParse interface*/
public class SentenceParseTest{

	/*
	 * Function that test SentenceParse.parseString()
	 * @param static string input1
	 * @param static string input2
	 * @return true if test work
	 */
	@Test
	public void testSentenceParse() {
		String input1 = "It was many and many a year ago";
		String input2 = "Copyright,Microsoft:Corporation";
		
		assertTrue(SentenceParse.parseString(input1), true);
		assertTrue(SentenceParse.parseString(input2), true);
	}

}
