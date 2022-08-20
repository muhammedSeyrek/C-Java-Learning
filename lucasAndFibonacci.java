package springIntro;

import java.util.*;

public class lucasAndFibonacci {

	public static void main(String[] args) {
		int fib[] = new int[20];
		fib[0] = 0;
		fib[1] = 1;
		int lucas[] = new int[20];
		lucas[0] = 2;
		lucas[1] = 1;
		for(int i = 2; i < 20; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			lucas[i] = lucas[i - 1] + lucas[i - 2];
		}
		System.out.printf("Fibonacci = ");
		for(int i = 0; i < 20; i++) {
			System.out.printf("%d ", fib[i]);
		}
		System.out.printf("\nLucas = ");
		for(int i = 0; i < 20; i++) {
			System.out.printf("%d ", lucas[i]);
		}
			
	}

}
