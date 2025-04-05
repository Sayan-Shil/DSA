package B_Bit_Manipulation.B6_Count_Set_Bits;

import java.util.Scanner;

public class Approach2_Brian_Kerningam_Algorithm {
    public static int countSetBit(int num){
        int result=0;

        while (num>0){
           num= num & num-1;
           result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Number : ");
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(countSetBit(num));

    }
}
