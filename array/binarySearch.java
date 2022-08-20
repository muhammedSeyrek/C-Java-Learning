package springIntro;

import java.util.*;

public class binarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = {1, 3, 5, 8, 15, 18, 21, 54, 78, 89, 99, 104, 105};
		int size = array.length;
		int bottom = 0, top = size - 1, counter = 1;
		int middle = top / 2;
		System.out.println("Enter a number");
		int wanted = in.nextInt();
		while(wanted != array[middle]) {
			if(wanted > array[middle]) {
				bottom = middle;
				middle = (top + bottom) / 2;
			}
			else {
				top = middle;
				middle = (top + bottom) / 2;
			}
			counter++;
		}
		System.out.printf("%d.found step = %d", counter, array[middle]);
	}

}
