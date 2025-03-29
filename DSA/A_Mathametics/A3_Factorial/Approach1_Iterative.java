package A_Mathametics.A3_Factorial;

public class Approach1_Iterative {
    private static void fact(int n){
        int res=1;
        for (int j = 2; j <=n ; j++) {
            res*=j;
        }
        System.out.println("The Factorial of "+n+ " is "+res);
    }

    public static void main(String[] args) {
        fact(5);
    }
}
