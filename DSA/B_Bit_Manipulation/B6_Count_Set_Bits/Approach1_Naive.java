package B_Bit_Manipulation.B6_Count_Set_Bits;

import java.util.Scanner;

public class Approach1_Naive {
    public static int countSetBit(int num){
        int result=0;

        while (num>0){
            if(num%2==1) result++;
            num/=2;
        }
        return result;
    }
    public static int countSetBitWithBitOperation(int num){
        int result=0;

        while (num>0){
            if((num&1)==1) result++;
            num= num>>1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Number : ");
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(countSetBitWithBitOperation(num));

    }
}
