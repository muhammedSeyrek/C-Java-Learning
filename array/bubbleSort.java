package springIntro;

import java.util.*;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numbers[] = new int [13];
		System.out.println("Numbers");
		for(int i = 0; i < 13; i++) {
			numbers[i] = (int)(Math.random() * 99) + 1;
			System.out.printf("%d ",numbers[i]);
		}
		int smaller;
		int i = 0;
		while(i < 12) {
			for(int j = i + 1; j < 13; j++) {
				if(numbers[i] < numbers[j]) {
					smaller = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = smaller;
				}
			}
			i++;
		}
		System.out.print("\nSequential Numbers = ");
		for(i = 0; i < 13; i++) {
			System.out.printf("%d ", numbers[i]);
		}
		System.out.printf("\nSmaller = %d\nBigger = %d", numbers[12], numbers[0]);
	}

}
