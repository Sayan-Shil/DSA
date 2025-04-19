package D_Arrays.D25_Equilibrium_Point;

public class Approach2_SlidingWindow_PrefixSum {

    public static boolean equilibriumPoint(int[] arr){
        int rightSum= 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum+=arr[i];
        }
        int leftSum=0;

        for (int i = 0; i <arr.length ; i++) {
            rightSum-=arr[i];
            if (leftSum==rightSum) return true;
            leftSum += arr[i];
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(equilibriumPoint(new int[]{4,-3,3}));
    }
}
