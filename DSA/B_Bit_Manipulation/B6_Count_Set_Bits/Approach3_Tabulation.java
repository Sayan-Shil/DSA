package B_Bit_Manipulation.B6_Count_Set_Bits;

import java.util.Scanner;

public class Approach3_Tabulation {
    public static int[] table = new int[256];
    static {
        table[0]=0;
        for (int i = 1; i < 256; i++) {
            table[i]= table[i&(i-1)]+1;
        }
    }

    public static int countSetBit(int num) {
        // Sum the set bits from each byte of the 32-bit integer
        return table[num & 255] +          // Least significant byte
                table[(num >> 8) & 255] +   // Second byte
                table[(num >> 16) & 255] +  // Third byte
                table[(num >> 24) ];   // Most significant byte
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Number : ");
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(countSetBit(num));

    }
}
