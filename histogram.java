package springIntro;

import java.util.Random;

public class histogram {

	public static void main(String[] args) {
		int array[] = new int [6];
		System.out.printf("Indis\tElementsOfArray\tHistogram\n");
		for(int i = 0; i < 6; i++) {
			array[i] = (int) (Math.random() * 30);
			System.out.printf("%d\t%d\t", i, array[i]);
			for(int j = 0; j < array[i]; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
