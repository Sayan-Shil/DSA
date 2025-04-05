package C_Recursion.C7_Palindrome_Check;

public class Approach2 {
    public static boolean checkPalindrome(String str) {
        return str == reverseString(str);
    }

    public static String reverseString(String str) {
        // Base case: if string is empty or has one character
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case: reverse the substring from index 1 onward, then add the first char to the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(checkPalindrome("aya"));
    }

}
