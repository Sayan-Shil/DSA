package A_Mathametics.A1_Count_Bits;

public class Approach1_Digit_Extraction {
    // Counting bits based on Digit Extraction
    private static void countBits(int x){
        int count=0;
        while(x>0){
            count++;
            x/=10;
        }
        System.out.println("Total Bits : " +count);
    }

    public static void main(String[] args) {
        countBits(1578);
    }
}
