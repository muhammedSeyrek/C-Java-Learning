package springIntro;

import java.util.*;

public class lineerSearch {

	public static void main(String[] args) {
		int array[] = {2, 3, 5, 8, 9, 12, 34, 65, 77, 88};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int wanted = in.nextInt();
		int i;
		for(i = 0; i < 10; i++) {
			if(wanted == array[i]) {
				break;
			}
		}
		System.out.printf("Number %d %d.found in step", wanted, i + 1);
	}

}
