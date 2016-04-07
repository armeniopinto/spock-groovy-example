package com.armeniopinto.example.spockgroovy;

import org.springframework.stereotype.Service;

@Service
public class Reverser {

	public String reverseWords(String sentence) {
		StringBuilder mirrored = new StringBuilder();

		String[] splitted = sentence.split(" ");
		for (int i = 0; i < splitted.length; i++) {
			String word = splitted[i];
			if (i > 0) {
				mirrored.append(" ");
			}
			mirrored.append(isWord(word) ? reverse(word) : word);
		}

		return mirrored.toString();
	}

	private static boolean isWord(String text) {
		return !text.matches(".*\\d+.*");
	}

	private static final String reverse(String word) {
		return new StringBuffer(word).reverse().toString();
	}

}