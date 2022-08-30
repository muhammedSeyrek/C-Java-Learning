package springIntro;

import java.util.*;

import java.lang.*;

public class operationsWithFunctions {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Galata Spor");
		a.insert(6, " Saray");
		System.out.println(a);
		a.setCharAt(6, '-');
		System.out.println(a);
		a.replace(12, 17, "Cimbom");
		System.out.println(a);
		
		String sa = Integer.toString(18);
		String b = String.valueOf(18);
		System.out.println(sa + b);
		String c = "18";
		double number = Double.parseDouble(c);
		System.out.println(number + number);
	}

}
