package A_Mathametics.A4_Factorial_Training_Zeroes_172;

public class Approach1_BruteForce {
    private static void TrailZeroes(int n){
        int res=1;
        for (int j = 2; j <=n ; j++) {
            res*=j;
        }
        int count=0;
        while (res%10==0){
            count++;
            res/=10;
        }
        System.out.println("The Trailing Zeroes of " +n+ " is "+ count);
    }


    public static void main(String[] args) {
        TrailZeroes(12);
        TrailZeroes(26); //Integer Overflow
    }
}
