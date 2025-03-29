package A_Mathametics.A1_Count_Bits;
import static java.lang.Math.*;

public class Approach2_Mathematical {

    //Mathematical
    private static void countBits(int x){
        System.out.println("Total Bits : " + (int)(log10(x)+1));
    }

    public static void main(String[] args) {
        countBits(1578);
    }
}
