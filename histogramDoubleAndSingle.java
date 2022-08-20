package springIntro;

import java.util.*;

public class histogramDoubleAndSingle {

	public static void main(String[] args) {
		int array[] = new int [30];
		int freq[] = new int [30];
		for(int i = 0; i < 30; i++) {
			array[i] = (int)(Math.random() * 30) + 1;
			freq[array[i] - 1]++;
		}
		for(int i = 0; i < 30; i++) {
			System.out.printf("%d = %d\n", array[i], freq[array[i] - 1]);
		}
		int counter = 0;
		System.out.println("Double number\tSingle number");
		for(int k = 0; k < 30; k++) {
			for(int i = 0; i < 30; i++) {
				if(counter == 0 && array[i] % 2 == 0) {
					System.out.printf("%d\t\t", array[i]);
					counter++;
				}
				if(counter == 1 && array[i] % 2 == 1) {
					System.out.printf("%d", array[i]);
					counter++;
				}
				if(counter == 2) {
					System.out.printf("\n");
					counter++;
					counter = 0;
				}
				
			}
		}
		
	}

}
