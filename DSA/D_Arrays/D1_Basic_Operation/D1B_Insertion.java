package D_Arrays.D1_Basic_Operation;

import static A_Basics.Basics.print;

public class D1B_Insertion {
    public static int[] insertAtPosition(int[] arr, int target , int position){
        for (int i = arr.length-1; i >position ; i--) {
            arr[i]= arr[i-1];
        }
        arr[position]=target;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,0};
        print(insertAtPosition(arr,4,3));

    }
}
