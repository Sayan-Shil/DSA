package A_Mathametics.A7_CheckForPrime;

public class Approach3_Optimal {
    private static boolean isPrime(int n){
        for (int i = 2; i*i <n ; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
