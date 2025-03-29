package A_Mathametics.A5_GreatestCommonFactor;

public class Approach4_TillingProblem {
    private static int GCF(int m, int n){
        int i=1;
        int count=1;
        while((i*i)<=(n*m)){
            if((n*m)%(i*i)==0){
                if(i>count) count=i;
            }
            i++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(GCF(4,12));
    }
}
