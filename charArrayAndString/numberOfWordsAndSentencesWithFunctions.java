package springIntro;

import java.util.*;

public class numberOfWordsAndSentencesWithFunctions {

	public static void main(String[] args) {
		String sent = "Gozler bostu donuktu. Sozler anlamsizdi soguktu." + 
	"belli ki buradan kopmustu.";
		String [] sentences = sent.split("[.]");
		int i = 0;
		for(String x : sentences) {
			i += 1;
			System.out.println(x);
		}
		System.out.printf("The sentences count = " + i);		
	}

}
