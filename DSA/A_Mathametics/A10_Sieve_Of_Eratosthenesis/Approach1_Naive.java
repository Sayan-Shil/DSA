package A_Mathametics.A10_Sieve_Of_Eratosthenesis;

import static A_Mathametics.A7_CheckForPrime.Approach4_MAXOptimal_Wheel_Factorization.isPrime;

public class Approach1_Naive {
    public static void TotalPrimes(int x){
        for (int i = 2; i < x; i++) {
            if(isPrime(i))
                System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        TotalPrimes(23);
    }
}
