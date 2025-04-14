package D_Arrays.D8_Left_Rotate_Array_OneTimes;

import static A_Basics.Basics.print;

public class Approach1_Extra_Space {
    public static int[] LeftRotateByOne(int[] arr){
        int[] result= new int[arr.length];
        result[arr.length-1]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i-1]=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        print(LeftRotateByOne(new int[]{1,2,3,4,5}));
    }
}
