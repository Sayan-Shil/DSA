package D_Arrays.D6_Remove_Duplicates_Sorted;

import static A_Basics.Basics.print;

public class Approach1_ExtraSpace {
    public static int[] removeDuplicate(int[] arr){
        int[] rev = new int[arr.length];
        int index=0;
        rev[0] = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]==arr[i-1]){
                continue;
            }
            rev[++index] = arr[i];
        }
        for (int i = index+1; i < arr.length ; i++) {
            rev[i]=0;
        }
        return rev;
    }
    public static void main(String[] args) {
        print(removeDuplicate(new int[]{10,10}));
    }
}
