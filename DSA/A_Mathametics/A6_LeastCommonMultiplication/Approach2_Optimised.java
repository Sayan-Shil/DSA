package A_Mathametics.A6_LeastCommonMultiplication;

public class Approach2_Optimised {
    private static int LCM(int m, int n){
        int x=m;
        int y=n;
        while(m!=n){
            if(m>n) m=m-n;
            else n=n-m;
        }
        return m*(x/m)*(y/m); // (x*y)/m
    }



    public static void main(String[] args) {
        System.out.println(LCM(4,12));
    }
}
