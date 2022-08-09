package springIntro;

import java.util.*;

public class fibonnaciWithRecursive {

	static int fibR(int number) {
		if(number == 1)
			return 1;
		else if(number == 0)
			return 0;
		return fibR(number - 1) + fibR(number - 2);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println("Fibonacci " + number + ".elements = " + fibR(number));
	}

}
