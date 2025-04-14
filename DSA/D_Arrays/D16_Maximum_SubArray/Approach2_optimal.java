package D_Arrays.D16_Maximum_SubArray;

public class Approach2_optimal {
    public static int MaxSubArray(int[] arr){
        int result=0;
        int present= 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<0){
                present = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(MaxSubArray(new int[]{2,3,-8,7,-1,2,3}));
    }
}
