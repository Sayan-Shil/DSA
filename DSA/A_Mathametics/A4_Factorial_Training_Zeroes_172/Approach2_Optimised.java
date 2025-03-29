package A_Mathametics.A4_Factorial_Training_Zeroes_172;

public class Approach2_Optimised {
    private static void TrailZeroes(int n){
        int count=0;
        for (int i = 5; i <=n; i*=5) {
            count += n/i;
        }
        System.out.println("The Trailing Zeroes of " +n+ " is "+ count);
    }


    public static void main(String[] args) {
        TrailZeroes(12);
        TrailZeroes(26); //No Integer Overflow
    }
}
