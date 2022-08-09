package springIntro;

import java.util.*;

public class findSmallestAndBiggest {

	static int biggest(int x, int y) {
		if(x > y)
			return x;
		else 
			return y;
	}
	static int smallest(int x, int y) {
		if(x > y)
			return y;
		else 
			return x;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number");
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println("Small number = " + smallest(x, y));
		System.out.println("Big number = " + biggest(x, y));
		
	}

}
