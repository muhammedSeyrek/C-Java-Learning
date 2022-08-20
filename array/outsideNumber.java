package springIntro;

import java.util.*;

public class outsideElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a elements number = ");
		int elements = in.nextInt();
		int array [] = new int [elements];
		System.out.println("Enter a array elements");
		for(int i = 0; i < elements; i++) {
			array[i] = in.nextInt();
		}
		for(int i = 0; i < elements; i++) {
			System.out.printf(array[i] + " ");
		}
	}

}
