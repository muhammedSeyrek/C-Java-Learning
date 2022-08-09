package springIntro;

import java.util.*;

public class calcWithFunc {

	static float sum(int number1, int number2) {
		return number1 + number2;
	}
	static float extrac(int number1, int number2) {
		return number1 - number2;
	}
	static float impact(int number1, int number2) {
		return number1 * number2;
	}
	static float divide(int number1, int number2) {
		return (float) number1 / (float) number2;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decision = 1;
		while(decision != 0) {
			System.out.println("Enter the numbers you will proccess");
			int number1 = in.nextInt();
			int number2 = in.nextInt();
			System.out.printf("Choose proccess\n1 - Sum\n2 - Extraction\n3 - Impact\n4 - Divide\n");
			int choose = in.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Result = " + sum(number1, number2));
				break;
			case 2:
				System.out.println("Result = " + extrac(number1, number2));
				break;
			case 3:
				System.out.println("Result = " + impact(number1, number2));
				break;
			case 4:
				System.out.println("Result = " + divide(number1, number2));
				break;
			default:
				System.out.println("Enter a choose again");
				choose = in.nextInt();
				break;
			}
		System.out.println("Do you want contuine ? (Contuine = 1 / Break = 0) = ");
		decision = in.nextInt();
		}
		System.out.println("It's done");
	}
	
}
