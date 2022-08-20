package springIntro;

public class insertionAlgorithm {

	public static void main(String[] args) {
		int array[] = {2, 5, 6, 1, 78, 43, 23, 89, 9, 14};
		int add;
		for(int i = 1; i < 10; i++) {
			add = array[i];
			while(i > 0 && (array[i - 1] > add)) {
				array[i] = array[i - 1];
				i -= 1;
			}
			array[i] = add;
		}
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
	
}
