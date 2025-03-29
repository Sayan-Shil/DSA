package A_Mathametics.A9_All_Divisors;

public class Approach3_Optimal_Sorted {
    public static void allDivisors(int n){
        int i;
        for (i = 1; i*i < n; i++) {
            if(n%i==0) {
                System.out.println(i);
            }
        }
        for (; i>=1; i--) {
            if(n%i==0) {
                System.out.println(n/i);
            }
        }

    }

    public static void main(String[] args) {
        allDivisors(50);
    }
}
