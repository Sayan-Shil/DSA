package D_Arrays.D5_Reverse_Array;

import static A_Basics.Basics.print;

public class Approach1_Extra_Array {
    public static int[] reverseArray(int[] arr){
        int[] rev = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            rev[i] = arr[arr.length-1-i];
        }
        return rev;
    }
    public static void main(String[] args) {
        print(reverseArray(new int[]{1,2,3,4,5}));
    }
}
