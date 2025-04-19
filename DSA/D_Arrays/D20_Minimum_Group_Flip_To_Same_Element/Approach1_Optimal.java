package D_Arrays.D20_Minimum_Group_Flip_To_Same_Element;

public class Approach1_Optimal {
    public static void MinimumFlipToFill(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]!=arr[i-1] && arr[i-1]==arr[0]){
                System.out.print(" From Index : " +i);
            }
            else if(arr[i]!=arr[i-1] && arr[i-1]!=arr[0]){
                System.out.println(" To Index : " +(i-1));
            }
        }
        if(arr[arr.length-1]!=arr[0]){
            System.out.print(" To Index : " +(arr.length-1));
        }
    }
    public static void main(String[] args) {
        MinimumFlipToFill(new int[]{1,1,1,1,1,1,0,1,1,1,0,0,0,0});
    }
}
