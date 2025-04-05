package C_Recursion.C10_Generating_Subset;

public class Approach1 {
    public static void generateSubset(String s) {
        generateSubsets("",s,0);
    }

    private static void generateSubsets(String s, String raw, int i) {
        if(i==raw.length()) {
            System.out.println(s);
            return;
        }

        generateSubsets(s+ raw.charAt(i),raw,i+1);
        generateSubsets(s,raw,i+1);
    }

    public static void main(String[] args) {
        generateSubset("ABC");
    }


}
