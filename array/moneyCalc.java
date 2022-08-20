package springIntro;

import java.util.*;

public class moneyCalc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double money = 0;
		int cash[] = { 200, 100, 50, 20, 10, 5, 1 };
		int freqC[] = new int[7];
		double penny[] = { 0.50, 0.25, 0.1, 0.05 };
		int freqP[] = new int[4];
		System.out.println("Enter a money");
		money = in.nextFloat();
		int i = 0;
		while (i < 7) {
			int counter = (int) money / cash[i];
			freqC[i] = counter;
			money -= (cash[i] * freqC[i]);
			i++;
		}
		i = 0;
		money += 0.001;
		while(i < 4) {
			int counter =  (int) (money / penny[i]);
			freqP[i] = counter;
			money -= (penny[i] * freqP[i]);
			i++;
		}
		for(i = 0; i < 7; i++) {
			System.out.printf("%d piece %d\n", freqC[i], cash[i]);
		}
		for(i = 0; i < 4; i++) {
			System.out.printf("%d piece %f\n", freqP[i], penny[i]);
		}
	}
}