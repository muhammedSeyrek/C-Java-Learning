package springIntro;

import java.util.*;

import java.lang.*;

public class passwordAppl {

	public static void main(String[] args) {
		String pass;
		Scanner in = new Scanner(System.in);
		int counter = 0;
		while(counter < 3) {
			System.out.printf("Enter password = ");
			pass = in.next();
			if(pass.compareTo("apple") == 0) {
				System.out.printf("Correct");
				break;
			}
			else {
				if(counter == 2) {
					System.out.printf("\nWrong password");
					break;
				}
				System.out.printf("Try again\n");
			}
			counter++;
		}
	}

}
