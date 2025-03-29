package A_Mathametics.A7_CheckForPrime;

public class Approach1_BruteForce {
    private static boolean isPrime(int n){
        for (int i = 2; i <n ; i++) {
            for (int j = i; j <n ; j=j*i) {
                if(n%j==0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
