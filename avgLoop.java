package springIntro;

import java.util.*;

public class avgLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0, counter = -1, number = 1;
		double avg = 0;
		while(number != 0) {
			System.out.println("Enter a number");
			number = in.nextInt();
			sum += number;
			counter++;
		}
		avg = ((float)sum / counter);
		System.out.println("Avarage = " + avg);
	}

}
