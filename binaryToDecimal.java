package springIntro;

import java.util.*;

public class binaryToDecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int binary = in.nextInt();
		int pow = 1, decimal = 0;
		while(binary > 0) {
			decimal += (binary % 10) * pow;
			pow *= 2;
			binary /= 10;
		}
		System.out.println("Decimal equivalent = " + decimal);
	}

}
