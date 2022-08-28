package springIntro;

import java.util.*;

public class usingIndex {

	public static void main(String[] args) {
		String a = "Sakarya";
		System.out.printf("%c\t%c\n", a.charAt(0), a.charAt(5));
		System.out.println((int) a.charAt(1));
		System.out.printf("\n%.3s\n", a);
		char name[] = {'M', 'u', 'h', 'a', 'm', 'm', 'e', 'd'};
		System.out.println(a.substring(3));
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%c", name[i]);
		}
		System.out.println();
		for(int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i));
		}
	}

}
