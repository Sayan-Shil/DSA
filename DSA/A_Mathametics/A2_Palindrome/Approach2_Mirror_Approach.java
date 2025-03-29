package A_Mathametics.A2_Palindrome;

import static java.lang.Math.log10;

public class Approach2_Mirror_Approach {
    //Mirror Approach O(log n)
    private static void isPalindrome(int n){
        int countBits = (int)(log10(n)+1);
        if(countBits==1) {
            System.out.println("Is " +n+ " Palindrome? : true ");
            return;
        }
        // Build a number with half digits
        int half_n= countBits/2;
        int new_n=0;
        int old_n=n;

        for (int i = 0; i < half_n; i++) {
            new_n = new_n*10 + n%10;
            n/=10;
        }

        if(countBits%2==1) System.out.println("Is " +old_n+ " Palindrome? " +(n/10==new_n));
        else System.out.println("Is " +old_n+ " Palindrome? " +(n==new_n));

    }

    public static void main(String[] args) {
        isPalindrome(15);
    }
}
