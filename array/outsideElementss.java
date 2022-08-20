package springIntro;

import java.util.*;

public class outsideElementss {

	public static void main(String[] args) {
		int elements, sum = 0;
		System.out.println("Enter a element number");
		Scanner in = new Scanner(System.in);
		elements = in.nextInt();
		int array[] = new int[elements];
		for(int i = 0; i < elements; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		System.out.println("\nSum = " + sum);
	}

}
