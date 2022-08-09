package springIntro;

import java.util.*;

public class randomNumbers {

	static void rand() {
		Random random = new Random();
		int number = random.nextInt(70) + 7;
		System.out.printf("Square of the %d = %d\n", number, frame(number));
	}
	
	static int frame(int number) {
		return number * number;
	}

	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			rand();
		}

	}

}
