package springIntro;

import java.util.*;

public class copyFunctions {

	public static void main(String[] args) {
		char name[] = {'S', 'a', 'k', 'a', 'r', 'y', 'a', '\0'};
		String copyName;
		copyName = String.copyValueOf(name, 0, 4);
		System.out.println(copyName);
	}

}
