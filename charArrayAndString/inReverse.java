package springIntro;

import java.util.*;
import java.lang.*;

public class inReverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		for(int i = name.length() - 1; i >= 0; i--)
			System.out.print(name.charAt(i));
		StringBuilder str = new StringBuilder(name);
		str.reverse();
		System.out.println("\n" + str);
	}

}
