package D_Arrays.D10_Leaders_In_Array;

public class Approach1_Naive_Solution {

    public static void LeaderOfArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int j= i+1;
            for (; j < arr.length; j++) {
                if(arr[j]>=arr[i])
                    break;
            }
            if(j== arr.length) System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        LeaderOfArray(new int[]{10,20,30});
    }
}
