package springIntro;

import java.util.*;

public class matricesDoubleAndSingle {

	public static void main(String[] args) {
		int array[][] = new int[3][4], doubleA[] = new int[12], singleA[] = new int[12];
		int counterD = 0, counterS = 0; 
		System.out.println("Numbers");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				array[i][j] = (int) (Math.random() * 9) + 1;
				System.out.printf("[%d,%d] = %d\t", i, j, array[i][j]);
				if(array[i][j] % 2 == 0) {
					doubleA[counterD] = array[i][j];
					counterD++;
				}
				else {
					singleA[counterS] = array[i][j];
					counterS++;
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("Double = ");
		for(int i = 0; i < counterD; i++) {
			System.out.printf("%d ", doubleA[i]);
		}
		System.out.printf("\nSingle = ");
		for(int j = 0; j < counterS; j++) {
			System.out.printf("%d ", singleA[j]);
		}
	}

}
