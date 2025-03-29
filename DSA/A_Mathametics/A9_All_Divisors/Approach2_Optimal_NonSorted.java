package A_Mathametics.A9_All_Divisors;

public class Approach2_Optimal_NonSorted {
    public static void allDivisors(int n){
        for (int i = 1; i*i < n; i++) {
            if(n%i==0) {
                System.out.println(i);
                if(i!=(n/i))
                    System.out.println(n/i);
            }
        }

    }

    public static void main(String[] args) {
        allDivisors(100);
    }
}
