package springIntro;

import java.util.Scanner;

public class factorialWithRecursiveFunctions {
	
	static int factR(int number) {
		if(number < 1) {
			return 1;
		}
		return number * factR(number - 1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = in.nextInt();
		System.out.println("Factorial = " + factR(number));
	}

}
