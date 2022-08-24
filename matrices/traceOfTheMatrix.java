package springIntro;

import java.util.*;

public class traceOfTheMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = in.nextInt();
		int array[][] = new int[n][n];
		int trace = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * 100) + 1;
				System.out.printf("%d\t", array[i][j]);
				if((i + j) == 0 || (i + j) == ((n * 2) - 2) || (i == 0 && j == n - 1) || (j == 0 && i == n - 1)) {
					trace += array[i][j];
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\nTrace of the matrix = %d", trace);
	}

}
