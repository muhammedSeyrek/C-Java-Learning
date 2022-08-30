package springIntro;

import java.util.*;

import java.lang.*;

public class fibonacciWithString {

	public static void main(String[] args) {
		String value1 = "b";
		String value2 = "a";
		String fib = "";
		int count = 7;
		System.out.printf("%s\n%s\n", value1, value2);
		fib = fib.concat(value2);
		while(count > 0) {
			fib = fib.concat(value1);
			value1 = value2;
			value2 = fib;
			System.out.println(fib);
			count--;
		}
	}

}
