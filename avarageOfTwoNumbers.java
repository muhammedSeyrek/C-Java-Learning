package springIntro;
import java.util.*;
public class avarageOfTwoNumbers {
	public static void main(String[] args) {
		int a, b;
		Scanner Input = new Scanner(System.in);
		float avg = 0;
		a = Input.nextInt();
		b = Input.nextInt();
		avg = (a + b) / 2f;
		System.out.println("Avarage = " + avg);
	}
}
