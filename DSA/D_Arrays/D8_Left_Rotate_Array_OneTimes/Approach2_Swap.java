package D_Arrays.D8_Left_Rotate_Array_OneTimes;

import static A_Basics.Basics.*;

public class Approach2_Swap {
    public static int[] LeftRotateByOne(int[] arr){
        int swapValue = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]= arr[i+1];
        }
        arr[arr.length-1]= swapValue;
        return arr;
    }

    public static void main(String[] args) {

        print(LeftRotateByOne(new int[]{1,2,3,4,5}));
    }
}
