package springIntro;

import java.util.*;

public class fromFahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Fahrenheit value = ");
		float fahn = in.nextFloat();
		float celc = trans(fahn);
		System.out.println("Celcius Value = " + celc);
	}
	static float trans(float fahn) {
		return (float) ((fahn - 32) / 1.8);
	}

}
