package B_Bit_Manipulation.B7_Power_Of_2;

import java.util.Scanner;

public class Approach_Main {
    public static boolean PowerOf2(int num){
        return (num&(num-1))==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Number : ");
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(PowerOf2(num));
    }
}
