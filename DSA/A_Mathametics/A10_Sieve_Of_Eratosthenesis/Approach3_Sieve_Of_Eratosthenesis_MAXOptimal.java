package A_Mathametics.A10_Sieve_Of_Eratosthenesis;

import java.util.Arrays;

public class Approach3_Sieve_Of_Eratosthenesis_MAXOptimal {
    public static void TotalPrimes(int x){
        boolean[] isPrime = new boolean[x+1];
        Arrays.fill(isPrime,true);
        for (int j = 2*2; j <=x; j+=2) {
            isPrime[j]=false;
        }
        for (int j = 2*3; j <=x; j+=3) {
            isPrime[j]=false;
        }
        for (int i = 5; i*i <=x ; i+=5) {
            if(isPrime[i]){
                for (int j = 2*i; j <=x; j+=i) {
                    isPrime[j]=false;
                }
            }
            if(isPrime[i]){
                for (int j = 2*i; j <=x; j+=i) {
                    isPrime[j+2]=false;
                }
            }
        }
        for (int i = 2; i <=x ; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        TotalPrimes(23);
    }
}
