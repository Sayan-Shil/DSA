package D_Arrays.D4_Check_If_Sorted;

public class Solution {
    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,5,7,10}));
    }
}
