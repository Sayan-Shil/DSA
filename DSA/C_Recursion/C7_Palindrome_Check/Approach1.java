package C_Recursion.C7_Palindrome_Check;

public class Approach1 {
    public static boolean checkPalindrome(String str) {
        return checkForPalindrome(str,0,str.length()-1);
    }

    private static boolean checkForPalindrome(String str, int start, int end) {
        if(start>=end) return true;

        return (str.charAt(start)==str.charAt(end)) && checkForPalindrome(str,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("aya"));
    }

}
