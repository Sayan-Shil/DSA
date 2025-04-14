package D_Arrays.D7_Move_Zeroes;

import static A_Basics.Basics.print;
public class Approach1_Extra_Space {
    public static int[] moveZeroes(int[] arr){
       int[] result = new int[arr.length];
       int swapIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                result[swapIndex++]=arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        print(moveZeroes(new int[]{10,0,0,20,79,0,0,54,0,54}));
    }
}
