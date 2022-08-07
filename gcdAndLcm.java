package springIntro;

import java.util.*;

public class gcdAndLcm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number1, number2, lcm = 1, gcd = 1, bigN, smallN;
		System.out.println("Enter two number to find lcm and gcd");
		number1 = in.nextInt();
		number2 = in.nextInt();
		if(number1 > number2) {
			bigN = number1;
			smallN = number2;
		}
		else {
			bigN = number2;
			smallN = number1;
		}
		int creep = 1;
		for(int i = bigN; i >= 1; i--) {
			if(bigN % i == 0 && smallN % i == 0 && creep == 1) {
				gcd = i;
				creep = 0;
			}
			if((smallN * i) % bigN == 0)
				lcm = smallN * i;
		}
		System.out.println("Gcd = " + gcd);
		System.out.println("Lcm = " + lcm);
	}

}
