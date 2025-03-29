package A_Mathametics.A3_Factorial;

public class Approach2_Recursive {
    private static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println("The Factorial of "+5+ " is "+fact(5));
    }
}
