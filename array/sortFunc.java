package springIntro;

import static java.util.Arrays.sort;

public class sortFunc {

	public static void main(String[] args) {
		char name[] = {'s', 'e', 'l', 'i', 'm', 'i', 'y', 'e'};
		sort(name);
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%c ", name[i]);
		}
	}

}
