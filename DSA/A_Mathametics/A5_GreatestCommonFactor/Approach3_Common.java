package A_Mathametics.A5_GreatestCommonFactor;

import static java.lang.Math.min;

public class Approach3_Common {
    private static int GCF(int m, int n){
        int min = min(m,n) -1;

        while(min>0){
            if(m%min==0 && n%min==0) break;
            min--;
        }
        return min;
    }


    public static void main(String[] args) {
        System.out.println(GCF(4,12));
    }
}
