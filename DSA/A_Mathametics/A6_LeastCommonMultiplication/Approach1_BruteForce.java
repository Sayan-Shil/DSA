package A_Mathametics.A6_LeastCommonMultiplication;

import static java.lang.Math.max;

public class Approach1_BruteForce {
    private static int LCM(int m, int n){
        int max= max(m,n);
        while (true){
            if(max%m==0 && max%n==0) break;
            max++;
        }
        return max;
    }



    public static void main(String[] args) {
        System.out.println(LCM(4,15));
    }
}
