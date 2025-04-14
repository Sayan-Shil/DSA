package D_Arrays.D16_Maximum_SubArray;

public class Approach1_Naive {
    public static int MaxSubArray(int[] arr){
        int result=0;
        for (int i = 0; i <arr.length ; i++) {
            int sum = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                sum+= arr[j];
                result= Math.max(sum,result);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(MaxSubArray(new int[]{2,3,-8,7,-1,2,3}));
    }
}
