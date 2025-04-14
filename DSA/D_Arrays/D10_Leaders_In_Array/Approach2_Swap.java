package D_Arrays.D10_Leaders_In_Array;

public class Approach2_Swap {
    public static void LeaderOfArray(int[] arr){
        int leader = arr[arr.length-1];
        System.out.println(leader);

        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>leader){
                leader=arr[i];
                System.out.println(leader);
            }
        }
    }
    public static void main(String[] args) {
        LeaderOfArray(new int[]{10,20,30,20,10});
    }
}
