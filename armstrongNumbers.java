package springIntro;

public class armstrongNumbers {

	public static void main(String[] args) {
		int counter = 1;
		for(int i = 100; i < 1000; i++) {
			int arm = 0, temp = i; 
			while(temp != 0) {
				arm += Math.pow((temp % 10), 3);
				temp /= 10;
			}
			if(arm == i) {
				System.out.println(counter + ".Armstrong number = " + arm); 
				counter++;
			}
		}
	}

}
