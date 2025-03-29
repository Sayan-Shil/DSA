package A_Mathametics.A10_Sieve_Of_Eratosthenesis;

import java.util.ArrayList;
import java.util.Arrays;

import static A_Mathametics.A7_CheckForPrime.Approach4_MAXOptimal_Wheel_Factorization.isPrime;

public class Approach2_Sieve_Of_Eratosthenesis_Optimal {
    public static void TotalPrimes(int x){
        boolean[] isPrime = new boolean[x+1];
        Arrays.fill(isPrime,true);
        for (int i = 2; i*i <=x ; i++) {
            if(isPrime[i]){
                for (int j = 2*i; j <=x; j+=i) {
                    isPrime[j]=false;
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
