
package notprimenumber;

public class NotPrimeNumber {

    public static void main(String[] args) {
        for(int i = 2; i < 100; i++){
            int flag = 1;
            for(int j = 2; j < i; j++)
                if(i % j == 0){
                    if(flag == 1)
                        System.out.printf("%d : ", i);
                    flag = 0;
                    int flag2 = 1;
                    for(int k = 2; k < j && flag2 == 1; k++)
                        if(j % k == 0)
                            flag2 = 0;
                    if(flag2 == 1)
                        System.out.printf("%d ", j);
                }
            if(flag == 0)
                System.out.println("");
        }
    }
}
