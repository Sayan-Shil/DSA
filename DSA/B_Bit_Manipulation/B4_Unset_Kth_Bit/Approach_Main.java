package B_Bit_Manipulation.B4_Unset_Kth_Bit;

import java.util.Scanner;

public class Approach_Main {
    public static int unSetNthBit(int num, int target){
        return (num ^ (1<<(target-1)) );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Number : ");
        int num = sc.nextInt();
        System.out.println("Your Target : ");
        int target= sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(unSetNthBit(num,target)));

    }
}
