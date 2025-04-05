package C_Recursion.C8_Sum_Of_Digit;

public class Approach {
    public static int getSum(int n){
        if(n<=9) return n;
        return (n%10) + getSum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(getSum(20000));
    }
}
