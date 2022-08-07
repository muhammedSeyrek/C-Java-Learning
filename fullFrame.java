package springIntro;

import java.util.*;

public class fullFrame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number = in.nextInt();
		int sqrtN;
		sqrtN = (int) Math.sqrt(number) * (int) Math.sqrt(number);
		System.out.println(number == sqrtN ? "Full frame" : "Not full frame");
	}

}
