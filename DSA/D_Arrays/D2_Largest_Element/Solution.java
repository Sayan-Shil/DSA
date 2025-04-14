package D_Arrays.D2_Largest_Element;

public class Solution {
    public static int Largest(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest) largest=arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        System.out.println(Largest(new int[]{1,5,8,3,5,4}));
    }
}
