package D_Arrays.D6_Remove_Duplicates_Sorted;

import static A_Basics.Basics.print;

public class Approach2_2_Pointer_Swap {
    public static int[] removeDuplicate(int[] arr){
        int swapIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
               arr[++swapIndex]=arr[i];
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        print(removeDuplicate(new int[]{10,10,20,20,20,30,30}));
    }
}
