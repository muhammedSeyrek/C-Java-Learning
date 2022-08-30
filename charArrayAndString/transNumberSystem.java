package springIntro;

import java.util.Scanner;

public class transNumberSystem {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number");
		Scanner in  = new Scanner(System.in);
		number = in.nextInt();
		System.out.println("Binary equivalent of a number = " + Integer.toBinaryString(number));
		System.out.println("Octal equivalent of a number = " + Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent of a number = " + Integer.toHexString(number));
	}

}
