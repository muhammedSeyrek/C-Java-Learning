package springIntro;
import java.util.Scanner;
public class theSmallerOfTheTwo {
	public static void main(String[] args) {
		System.out.println("Please, enter two numbers");
		Scanner Input = new Scanner(System.in);
		int a, b;
		a = Input.nextInt();
		b = Input.nextInt();
		if(a > b) {
			System.out.println("Numbers = " + b + " < " + a);
		}
		else if(a == b) {
			System.out.println("Numbers\n" + a);
			System.out.println(b);
		}
		else {
			System.out.println("Numbers = " + a + " < " + b);
		}
	}
}
