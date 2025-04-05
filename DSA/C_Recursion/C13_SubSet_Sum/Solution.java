package C_Recursion.C13_SubSet_Sum;

public class Solution {

    private static int subsetSum(int[] arr, int sum) {
        return SubSet(arr,sum,0);
    }

    private static int SubSet(int[] arr, int sum, int length) {
        if(sum==0) return 1;
        if(length==arr.length) return 0;
        if(sum<0) return 0;

        return SubSet(arr,sum-arr[length],length+1) + SubSet(arr,sum,length+1);
    }

    public static void main(String[] args) {
        System.out.println(subsetSum(new int[]{10,5,2,3,6},0));
    }




}
