package springIntro;

import java.util.*;

public class binarySearchWithFunctions {
	private static Scanner search;
	public static void main(String[] args) {
		int [] array = {2, 13, 4, 6, 17, 12, 34, 67, 89};
		//diziyi sirala
		Arrays.sort(array);
		System.out.println("Ordered array");
		for(int a : array) {
			System.out.printf("%d ", a);
		}
		System.out.printf("\nNumber sought = ");
		search = new Scanner(System.in);
		int wanted = search.nextInt();
		int binary = Arrays.binarySearch(array, wanted);
		if(binary > 0) {
			System.out.printf("Found in step %d sought", binary + 1);
		}
		else {
			System.out.println("Not found");
		}
	}

}
