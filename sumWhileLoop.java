package springIntro;

import java.util.*;

public class sumWhileLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 10, sum = 0, number;
		while(i > 0) {
			System.out.printf("Enter a number = ");
			number = in.nextInt();
			sum += number;
			i--;
		}
		System.out.println("Sum = " + sum);
	}

}
