package springIntro;

import java.util.*;

public class randomDoubleNumbers {
	
	static void print(int numbers, int count) {
		System.out.println(count + ".Double numbers = " + numbers);
	}
	
	static void list(int big, int small) {
		int counter = 0;
		for(int i = small; i <= big; i++) {
			if(i % 2 == 0) {
				counter++;
				print(i, counter);
			}
		}
	}

	static void rNumbers(int x, int y) {
		int bigN, smallN;
		if(x > y) {
			bigN = x; smallN = y;
		}
		else {
			bigN = y; smallN = x;
		}
		list(bigN, smallN);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Random random = new Random();
		int number1 = random.nextInt(100);
		int number2 = random.nextInt(100);
		rNumbers(number1, number2);
	}

}
