package D_Arrays.D3_Second_Largest_Element;

public class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int max = arr[0];
        int min = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                min=max;
                max=arr[i];
            }
            else if(arr[i]>min){
                min= arr[i];
            }
        }

        return max == min ? -1 : min;
    }
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{1,5,8,3,7,4}));
    }
}
