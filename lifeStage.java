package springIntro;

import java.util.*;

public class lifeStage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if(age <= 2)
			System.out.println("Baby");
		else if(age <= 13)
			System.out.println("Childhood");
		else if(age <= 21)
			System.out.println("Youth");
		else if(age <= 64)
			System.out.println("Adulthood");
		else 
			System.out.println("Senile");
	}

}
