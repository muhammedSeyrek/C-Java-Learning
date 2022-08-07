package springIntro;

import java.util.*;

public class lightsUp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean lamp;
		lamp = in.nextBoolean();
		int answer = lamp == false ? 0 : 1;
		System.out.println("Lamp = " + answer);
	}

}
