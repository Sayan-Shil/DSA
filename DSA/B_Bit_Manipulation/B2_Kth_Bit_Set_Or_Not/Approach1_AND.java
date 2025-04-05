package B_Bit_Manipulation.B2_Kth_Bit_Set_Or_Not;

import java.util.Scanner;

public class Approach1_AND {
    public static boolean setOrNot(int num, int target){
        return ((num>>(target-1))&1) ==1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Number : ");
        int num = sc.nextInt();
        System.out.println("Your Target : ");
        int target= sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setOrNot(num,target));

    }
}
