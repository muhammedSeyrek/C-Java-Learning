package springIntro;
import java.util.*;
public class findHypotenuse {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Please enter the corners");
		int x = Input.nextInt();
		int y = Input.nextInt();
		double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Hypotenuse = " + hypotenuse);
	}
}
