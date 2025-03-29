package A_Mathametics.A11_Computing_Power;

public class Approach2_Binary {

    public static int Pow(int a, int b){
        if (b == 0) return 1; // Base case: anything^0 = 1
        int half = Pow(a, b / 2); // Compute once and reuse

        if (b % 2 == 0) return half * half;  // Even exponent case
        else return half * half * a;  // Odd exponent case
    }

    public static void main(String[] args) {

        System.out.println(Pow(5,6));
    }
}
