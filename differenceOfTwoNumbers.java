package springIntro;
import java.util.*;
public class differenceOfTwoNumbers {
	public static void main(String[] args) {
		int a, b, difference = 0;
		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
		difference = Math.abs(a - b);
		System.out.println("Difference of two numbers = " + difference);
	}
}
