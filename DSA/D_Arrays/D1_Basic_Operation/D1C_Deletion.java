package D_Arrays.D1_Basic_Operation;


import static A_Basics.Basics.print;

public class D1C_Deletion {
    public static int[] deleteElement(int[] arr, int target){
        int index=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index==Integer.MAX_VALUE) return new int[]{};

        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;

        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        print(deleteElement(arr,3));

    }
}
