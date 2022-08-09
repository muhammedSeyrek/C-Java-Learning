package springIntro;

import java.util.*;

public class headOrTails {

	static boolean headOrTails() {
		Random random = new Random();
		boolean money = random.nextBoolean();
		System.out.printf("Money is " + (money == true ? "Head" : "Tails"));
		return money;
	}
	
	public static void main(String[] args) {
		headOrTails();
	}

}
