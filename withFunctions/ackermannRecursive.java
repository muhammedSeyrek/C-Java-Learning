package springIntro;

import java.util.*;

public class ackermannRecursive {

	static int ackermann(int m, int n) {
		if(m == 0)
			return n + 1;
		else if(m > 0 && n == 0)
			return ackermann(m - 1, 1);
		else
			return ackermann(m - 1, ackermann(m, n - 1));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers , Style A(m, n)");
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println("Result = " + ackermann(m, n));
	}

}
