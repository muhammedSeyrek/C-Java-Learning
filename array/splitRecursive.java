package springIntro;

import java.util.Scanner;

import java.util.*;

public class splitRecursive {

	static int split(int m, int n) {
		if(n == 1)
			return 0;
		System.out.printf("%d : %d\n",m , n);
		int temp = n;
		temp = (int) Math.random() * n;
		m = n - temp;
		return split(m, split(m, temp));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		split(number1, number2);
	}

}
