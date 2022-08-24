package springIntro;

import java.util.*;

public class matricesTranspose {

	public static void main(String[] args) {
		int array[][] = new int[3][4];
		int transpose[][] = new int[4][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				array[i][j] = in.nextInt();
				transpose[j][i] = array[i][j];
			}
		}
		System.out.println("\nClassical Matrix\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.println("\n\nTranspose Matrix\n");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("%d ", transpose[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
