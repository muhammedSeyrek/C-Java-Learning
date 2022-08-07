package springIntro;

import java.util.*;

public class moveTakeSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 1;
		while(number != 0) {
			System.out.println("Enter a number");
			number = in.nextInt();
			System.out.println("Square = " + Math.pow(number, 2));
		}
		
	}

}
