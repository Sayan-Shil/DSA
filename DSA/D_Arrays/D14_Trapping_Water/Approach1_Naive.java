package D_Arrays.D14_Trapping_Water;

public class Approach1_Naive {
    public static int trappingWater(int[] arr){
        int result= 0;
        for (int i = 1; i < arr.length; i++) {

            int leftMax = arr[i];
            for (int j = 0; j <i ; j++) {
                leftMax = Math.max(leftMax,arr[j]);
            }
            int rightMax = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                rightMax = Math.max(rightMax,arr[j]);
            }

            result += Math.min(leftMax,rightMax)-arr[i];

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{1,2,3}));
    }
}
