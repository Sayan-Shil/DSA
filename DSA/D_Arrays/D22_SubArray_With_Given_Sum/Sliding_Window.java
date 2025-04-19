package D_Arrays.D22_SubArray_With_Given_Sum;

public class Sliding_Window {
    public static boolean SubArrayWithGivenSum(int[] arr, int target) {
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end]; // Add the current element to the sum

            // Shrink the window while sum is greater than target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(SubArrayWithGivenSum(new int[]{1,2,3,4},5));
    }
}
