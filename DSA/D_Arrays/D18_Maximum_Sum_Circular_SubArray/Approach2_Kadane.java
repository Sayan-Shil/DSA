package D_Arrays.D18_Maximum_Sum_Circular_SubArray;


public class Approach2_Kadane {
    public static int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, psum = 0, nsum = 0, n = nums.length, total = 0;
        for (int i = 0; i < n; i++) {
            psum = Math.max(nums[i], nums[i] + psum);
            max = Math.max(max, psum);

            nsum = Math.min(nums[i], nsum + nums[i]);
            min = Math.min(nsum, min);

            total += nums[i];
        }

        if (max < 0) return max;
        return Math.max(total - min, max);
    }
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{4, -2, 4, 4, -2, 4}));
    }
}
