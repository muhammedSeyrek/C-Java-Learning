package springIntro;

import java.util.*;

public class copyArray {

	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int B[] = A;
		for(int i = 0; i < 15; i++) {
			System.out.printf("%d ", B[i]);
		}
		int C[] = new int [15];
		System.arraycopy(B, 0, C, 0, 15);
		for(int i = 0; i < 15; i++) {
			System.out.printf("%d ", C[i]);
		}
	}

}
