package A_Mathametics.A9_All_Divisors;

public class Approach1_BruteForce {
    public static void allDivisors(int n){

        for (int i = 1; i < n; i++) {
            if(n%i==0) System.out.println(i);
        }

    }

    public static void main(String[] args) {
        allDivisors(100);
    }
}
