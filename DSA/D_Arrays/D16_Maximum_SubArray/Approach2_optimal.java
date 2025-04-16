package D_Arrays.D16_Maximum_SubArray;

public class Approach2_optimal {
    public static int MaxSubArray(int[] arr){
        int result = arr[0];
        int MaxEnding= arr[0];

        for (int i = 1; i < arr.length; i++) {
            MaxEnding = Math.max(MaxEnding+arr[i],arr[i]);
            result = Math.max(result,MaxEnding);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(MaxSubArray(new int[]{2,3,-8,7,-1,2,3}));
    }
}
