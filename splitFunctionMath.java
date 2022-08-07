package springIntro;

import java.util.*;

public class splitFunctionMath {
	public static void main(String[] args) {
		Scanner gir = new Scanner(System.in);
		double x = gir.nextDouble();
		double proccess = 0.0;
		if (x <= 0)
			proccess = Math.pow(x, 2) + 1;
		else if (x >= 1)
			proccess = x;
		else if (0 < x && x > 1)
			proccess = (double) Math.sqrt(x);

		System.out.printf("Result = %.3g", proccess);
	}
}