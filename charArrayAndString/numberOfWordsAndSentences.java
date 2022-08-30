package springIntro;

import java.util.*;

public class numberOfWordsAndSentences {

	public static void main(String[] args) {
		String sent = "Bugun sen cok gencsin yavrum";
		int wordsC = 0, sentC = 1;
		for(int i = 0; i < sent.length(); i++) {
			if(sent.charAt(i) == ' ') {
				sentC++;
			}
			wordsC++;
		}
		System.out.printf("Word count = %d\nSentences count = %d", wordsC, sentC);
	}

}
