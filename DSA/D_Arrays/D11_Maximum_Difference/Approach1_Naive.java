package D_Arrays.D11_Maximum_Difference;

public class Approach1_Naive {
    public static int MaxDifference(int[] arr){
        int check=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                check= Math.max(check,arr[j]-arr[i]);
            }
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println(MaxDifference(new int[]{2,3,10,6,4,8,1}));
    }
}