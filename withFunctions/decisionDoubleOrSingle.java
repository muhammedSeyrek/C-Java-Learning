package springIntro;

import java.util.*;

public class decisionDoubleOrSingle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number = in.nextInt();
		boolean value = decision(number);
		System.out.println("Odd if the value is true, double if false = " + value); 
	}
	static boolean decision(int number) {
		if(number % 2 == 0)
			return false;
		else
			return true;
	}

}
