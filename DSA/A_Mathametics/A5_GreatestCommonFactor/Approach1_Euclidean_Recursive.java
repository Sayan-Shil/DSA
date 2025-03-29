package A_Mathametics.A5_GreatestCommonFactor;

public class Approach1_Euclidean_Recursive {
    private static int GCF(int m, int n){
       if(m==n) return m;
       else if (m>n) return HCF(n,m);
       else return HCF(m,n);
    }

    private static int HCF(int m, int n) {
            if(m==1) return 1;
            if(n%m==0) return m;

            return HCF(n%m,n);

    }


    public static void main(String[] args) {
        System.out.println(GCF(4,12));
    }
}
