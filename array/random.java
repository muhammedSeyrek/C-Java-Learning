package springIntro;

import java.util.*;

public class random {

	public static void main(String[] args) {
		int array[] = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 6) + 1;
			System.out.print(array[i] + " ");
		}
	}

}
