package D_Arrays.D25_Equilibrium_Point;

public class Approach1_Naive {

    public static boolean equilibriumPoint(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int leftSum=0;
            int rightSum=0;
            for (int j = 0; j <i ; j++) {
                leftSum+=arr[j];
            }
            for (int j = i+1; j < arr.length ; j++) {
                rightSum+=arr[j];
            }
            if(leftSum==rightSum) {
                System.out.println(arr[i]);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(equilibriumPoint(new int[]{2,-2,3,-2,2}));
    }
}
