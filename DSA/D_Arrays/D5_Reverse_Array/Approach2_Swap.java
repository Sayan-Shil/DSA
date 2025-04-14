package D_Arrays.D5_Reverse_Array;

import static A_Basics.Basics.print;

public class Approach2_Swap {
    public static int[] reverseArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp= arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        print(reverseArray(new int[]{1,2,3,4}));
    }
}
