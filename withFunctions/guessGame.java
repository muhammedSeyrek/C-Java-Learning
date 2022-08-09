package springIntro;

import java.util.*;

public class guessGame {

	static int numbers() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
	
	public static void main(String[] args) {
		int guess = 0, counter = 0, randNumber = 0;
		Scanner in = new Scanner(System.in);
		while(guess != 1) {
			randNumber = numbers();
			Random rand = new Random();
			int a = rand.nextInt(5);
			int b = rand.nextInt(5);
			System.out.println("You guess = " + (randNumber - a) + " between " + (randNumber + b));
			int number = in.nextInt();
			counter++;
			guess = (randNumber == number) ? 1 : 0;
		}
		System.out.println("You found in the " + counter + " step = " + randNumber);
	}

}
