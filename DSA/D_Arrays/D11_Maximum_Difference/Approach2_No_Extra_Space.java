package D_Arrays.D11_Maximum_Difference;

public class Approach2_No_Extra_Space {
    public static int MaxDifference(int[] arr){
        int result= arr[1]-arr[0];
        int minValue=arr[0];

        for (int i = 1; i <arr.length ; i++) {
            result = Math.max(result, arr[i]-minValue);
            minValue = Math.min(minValue,arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(MaxDifference(new int[]{2,3,10,6,4,8,1}));
    }
}