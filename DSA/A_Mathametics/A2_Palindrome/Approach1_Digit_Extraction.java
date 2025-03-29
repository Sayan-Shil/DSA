package A_Mathametics.A2_Palindrome;

public class Approach1_Digit_Extraction {
    //Digit Extraction O(n)
    private static void isPalindrome(int n){
        int new_n=0;
        int old_n= n;

        while(n>0){
            new_n = new_n*10 + n%10;
            n/=10;
        }
        System.out.println("Is " +old_n+ " Palindrome? : " +(old_n==new_n));
    }

    public static void main(String[] args) {
        isPalindrome(15);
    }
}
