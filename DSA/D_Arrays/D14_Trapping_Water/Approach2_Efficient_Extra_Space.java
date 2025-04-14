package D_Arrays.D14_Trapping_Water;

public class Approach2_Efficient_Extra_Space {
    public static int trappingWater(int[] arr){
        int result= 0;
        int[] leftMax  = new int[arr.length];
        leftMax[0]=arr[0];
        int[] rightMax  = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        for (int i = arr.length-2; i>=0; i--) {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        for (int i = 1; i < arr.length-1; i++) {
            result += Math.min(leftMax[i],rightMax[i])  - arr[i];
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{3,0,1,2,5}));
    }
}
