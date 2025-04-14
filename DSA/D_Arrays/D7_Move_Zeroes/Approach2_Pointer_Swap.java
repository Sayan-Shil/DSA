package D_Arrays.D7_Move_Zeroes;

import static A_Basics.Basics.print;
public class Approach2_Pointer_Swap {
    public static int[] moveZeroes(int[] arr){
       int swapIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i]=arr[swapIndex];
                arr[swapIndex++]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        print(moveZeroes(new int[]{0,10,0,0,20,79,0,0,54,0,54}));
    }
}
