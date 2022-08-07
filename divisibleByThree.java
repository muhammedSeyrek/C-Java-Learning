package springIntro;

import java.util.*;

public class divisibleByThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, sum = 0, counter = 0;
		float avg;
		System.out.println("Enter the number N = ");
		n = in.nextInt();
		while(n > 0) {
			if(n % 3 == 0) {
				sum += n;
				counter++;
			}
			n--;
		}
		avg = (float) sum / counter;
		System.out.printf("Avarage of numbers divisible by 3 = %.2f", avg);
	}

}
