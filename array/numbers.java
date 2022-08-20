package springIntro;

public class numbers {

	public static void main(String[] args) {
		int array[] = new int[12];
		for(int i = 0; i <= 11; i++) {
			if(i < 6)
				array[i] = i;
			else
				array[i] = 11 - i;
			System.out.printf(array[i] + " ");
		}
	}

}
