package springIntro;

public class primeAndNotPrime {

	public static void main(String[] args) {
		int prime[] = new int[100];
		int notPrime[] = new int[100];
		int x = 0, y = 0;
		for(int i = 2; i < 100; i++) {
			int flag = 1;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					
					flag = 0;
				}
			}
			if(flag == 1) {
				prime[y] = i; y++;
			}	
			else {
				notPrime[x] = i; x++;	
			}
				
		}
		int n = 1;
		System.out.printf("Prime Number = ");
		for(int i = 0; i < y; i++) {
			System.out.printf("%d ", prime[i]);
		}
		System.out.print("\nNot prime numbers = ");
		for(int i = 0; i < x; i++) {
			System.out.printf("%d ", notPrime[i]);
			if(i == 20 * n) {
				System.out.print("\n");
				n++;
			}
		}
	}

}
