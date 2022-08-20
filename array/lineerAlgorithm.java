package springIntro;

import java.util.*;

public class lineerAlgorithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int wanted = in.nextInt();
		int array[] = {2, 5, 8, 14, 18, 56, 0};
		for(int i = 0; i < array.length; i++) {
			if(wanted < array[i + 1] && wanted > array[i]) {
				for(int j = array.length - 1; j >= i + 1; j--) {
					array[j] = array[j - 1];
				}
				array[i + 1] = wanted;
				break;
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
