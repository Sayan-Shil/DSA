package D_Arrays.D9_Left_Rotate_Array_Dtimes;

import java.util.Arrays;

import static A_Basics.Basics.print;

public class Approach2_Swap {
    public static int[] LeftRotateByD(int[] arr, int d){
        d=d%arr.length;
        for (int i = d; i <arr.length ; i++) {
            int temp=arr[i];
            arr[i]= arr[i-d];
            arr[i-d]=temp;
        }
        return arr;
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <100 ; i++) {
            int[] result= LeftRotateByD(new int[]{1,2,3,4,5,6,7,8,9,10},i);
            System.out.print("\r" + Arrays.toString(result));
            Thread.sleep(1000);
        }
    }
}
