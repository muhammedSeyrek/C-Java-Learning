package springIntro;

import java.util.*;

public class luhnAlgorithm {

	public static void main(String[] args) {
		int array[] = new int[16];
		int sum = 0;
		System.out.println("Enter the 16 digit card number");
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 16; i++) {
			array[i] = in.nextInt();
			if(i % 2 == 0) {
				sum += (array[i] * 2);
			}
			else {
				sum += array[i];
			}
			if(i == 15)
				if(sum % 10 == 0)
					System.out.println("Is a valid card number");
				else
					System.out.println("Not valid card number");
		}
	}

}
