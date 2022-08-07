package springIntro;

import java.util.*;

public class isItNegative {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number >= 0){
			System.out.println("Number is positive = " + number);
		}
		else {
			System.out.println("Number is negative = " + number);
		}
	}

}
