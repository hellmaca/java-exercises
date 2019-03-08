package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
	public static void characterList() {
		Scanner in = new Scanner(System.in);
		String userInput;
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		System.out.println("Give me a string: ");
		userInput = in.nextLine();
		userInput = userInput.toLowerCase();
		char[] charactersInString = userInput.toCharArray();
		
		
		for (Character c : charactersInString) {
			int count = 0;
			if (Character.isLetter(c)) {
			for (int i = 0; i<charactersInString.length; i++) {	
				if (c == charactersInString[i]) {
					count++;
				}
			}
			charCount.put(c, count);
		}
		}
		System.out.println(charCount);

}
}
