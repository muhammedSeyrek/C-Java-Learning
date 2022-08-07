package springIntro;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Which do you want make proccess");
		char operators = in.next().charAt(0);
		float number1, number2, result = 0;
		switch(operators) {
		case '+':
			System.out.println("Enter the numbers");
			number1 = in.nextFloat();
			number2 = in.nextFloat();
			result = number1 + number2;
			break;
		case '-':
			System.out.println("Number and number to subtract = ");
			number1 = in.nextFloat();
			number2 = in.nextFloat();
			result = number1 - number2;
			break;
		case '*':
			System.out.println("Enter the numbers");
			number1 = in.nextFloat();
			number2 = in.nextFloat();
			result = number1 * number2;
			break;
		case '/':
			System.out.println("Number and number to divide = ");
			number1 = in.nextFloat();
			number2 = in.nextFloat();
			result = number1 / number2;
			break;
		}
		System.out.println("Result = " + result);
	}

}
