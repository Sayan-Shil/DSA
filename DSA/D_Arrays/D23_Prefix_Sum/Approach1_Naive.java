package D_Arrays.D23_Prefix_Sum;

public class Approach1_Naive {
    public static int[] arr = new int[]{2,8,3,9,6,5,4};

    public static void getInt(int start, int end){
        int res=0;
        for (int i = start; i <= end ; i++) {
            res +=arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        getInt(1,2);
    }
}
