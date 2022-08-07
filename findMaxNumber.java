package springIntro;

import java.util.Scanner;

public class findMaxNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		int i = 3;
		int max = number;
		while(i > 0) {
			number = in.nextInt();
			if(max > number) {
				
			}
			else {	
				max = number;
			}
			i--;
		}
		System.out.println(max);
	}
}
