package springIntro;

import java.util.*;

public class crypto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char name[] = in.next().toCharArray();
		for(int i = 0; i < name.length; i++) {
			if(name[i] + 13 <= 90) {
				name[i] += 13;
			}
			else {
				int firstA = 0;
				while(name[i] <= 90) {
					firstA++;
					name[i]++;
				}
				int lastA = 13 - firstA;
				name[i] = 65;
				name[i] += lastA;
			}
		}
		System.out.println(name);
	}

}
