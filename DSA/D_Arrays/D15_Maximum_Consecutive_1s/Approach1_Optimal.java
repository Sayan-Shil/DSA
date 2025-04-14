package D_Arrays.D15_Maximum_Consecutive_1s;

public class Approach1_Optimal {

    public static int Maximum_1s(int[] arr){
        int result = 0;
        int present= 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                present=0;
            }
            else {
                present++;
                result=Math.max(result,present);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Maximum_1s(new int[]{1,1,1}));
    }
}
