package springIntro;

import java.util.*;

public class graphFunc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number = ");
		double time = in.nextDouble();
		double result = 0;
		if(time < 0)
			result = 0;
		else if(time <= 1 && time > 0)
			result = 1;
		else if(time > 1)
			result = time;
		System.out.println("Result = " + result);
	}

}
