package A_Mathametics.A8_PrimeFractors;

import static A_Mathametics.A7_CheckForPrime.Approach4_MAXOptimal_Wheel_Factorization.isPrime;

public class Approach1_Naive {
    public static void primeFactors(int n){
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.println(i);
                    x*=i;
                }
            }
        }
    }

    public static void main(String[] args) {
        primeFactors(52);
    }
}
