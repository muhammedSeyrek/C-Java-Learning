package springIntro;

import java.util.*;

import java.lang.*;

public class turkishEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tr[] = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma",
				"Cumartesi", "Pazar"};
		String en[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday", "Sunday"};
		System.out.println("Enter a turkish name");
		String word = in.next();
		System.out.printf("English name = ");
		boolean decision = false;
		int i;
		for(i = 0; i < 7 && decision == false; i++) {
			decision = tr[i].equalsIgnoreCase(word);
		}
		System.out.println(en[i - 1]);
	}

}
