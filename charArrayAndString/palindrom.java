package springIntro;

import java.util.*;

public class palindrom {

	static String reverse(String text) {
		StringBuilder str = new StringBuilder(text);
		str.reverse();
		return str.toString();
	}
	
	static void palindrome(String text) {
		String tempT = reverse(text);
		if(tempT.equals(text) == true) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String[] args) {
		String text;
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a text = ");
		text = in.next();
		palindrome(text);
	}

}
