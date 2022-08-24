package springIntro;

import java.util.*;

public class randomZeroOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("n Value = ");
		int n = in.nextInt();
		int numbers[][] = new int[n][n];
		int oneZero[] = new int[2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				numbers[i][j] = (int) (Math.random() * 2);
				oneZero[numbers[i][j]]++;
				System.out.printf("%d\t", numbers[i][j]);
			}
			System.out.println();
		}
		System.out.println("Number of zeros = " + oneZero[0]);
		System.out.println("Number of ones = " + oneZero[1]);
	}

}
