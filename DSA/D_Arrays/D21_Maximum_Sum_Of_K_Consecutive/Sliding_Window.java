package D_Arrays.D21_Maximum_Sum_Of_K_Consecutive;

public class Sliding_Window {
    public static int MaximumSumOfKElement(int[] arr, int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int result=sum;
        for (int i = k; i < arr.length; i++) {
             sum = sum + arr[i] - arr[i-k];
            result = Math.max(result,sum);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(MaximumSumOfKElement(new int[]{5,-10,6,90,3},2));
    }
}
