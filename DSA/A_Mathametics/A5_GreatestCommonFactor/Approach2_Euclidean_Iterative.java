package A_Mathametics.A5_GreatestCommonFactor;

import static java.lang.Math.min;

public class Approach2_Euclidean_Iterative {
    private static int GCF(int m, int n){
      while(m!=n){
          if(m>n) m=m-n;
          else n=n-m;
      }
      return m;
    }

    

    public static void main(String[] args) {
        System.out.println(GCF(4,12));
    }
}
