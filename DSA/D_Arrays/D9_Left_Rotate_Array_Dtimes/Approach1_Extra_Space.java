package D_Arrays.D9_Left_Rotate_Array_Dtimes;

import static A_Basics.Basics.print;

public class Approach1_Extra_Space {
    public static int[] LeftRotateByD(int[] arr, int d){
        d=d%arr.length;
        int[] result= new int[arr.length];
        int index=0;
        for (int i = d; i < arr.length; i++) {
            result[index++]=arr[i];
        }
        for (int i = 0; i < d; i++) {
            result[index++]=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        print(LeftRotateByD(new int[]{1,2,3,4,5,6},547));
    }
}
