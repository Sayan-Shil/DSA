package C_Recursion.C14_Permutations;

public class Permutations {

    // Method to generate permutations
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str); // Print the permutation
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i); // Swap current index with l
                permute(str, l + 1, r); // Recursive call
                str = swap(str, l, i); // Backtrack
            }
        }
    }

    // Method to swap characters
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // Main method to run the program
    public static void main(String[] args) {
        String str = "abc"; // Example input
        permute(str, 0, str.length() - 1); // Call the permute method
    }
}