package springIntro;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 	
		System.out.println("Enter the n");
		int n = in.nextInt();
		int first = 0, second = 1, fib = 1;
		while(n > 0) {
			System.out.printf(fib + " ");
			fib = first + second;
			first = second;
			second = fib;
			n--;
		}
		System.out.println("\n" + "Golden Raito = " + (float) second / first);
		System.out.println("\n" + "Equals = " + ((float) second / first) + 1 + " = " 
		+ Math.pow((float) second / first, 2));
	}
}