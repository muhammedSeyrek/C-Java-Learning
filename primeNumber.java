package springIntro;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a number = ");
		int number = in.nextInt();
		for(int i = 2; i < number; i++) {
			int flag = 1;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = 0;
				}
			}
			if(flag == 1) {
				System.out.printf("Prime Numbers = " + i + "\n");
			}
		}

	}

}
