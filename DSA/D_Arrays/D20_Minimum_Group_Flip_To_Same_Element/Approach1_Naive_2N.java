package D_Arrays.D20_Minimum_Group_Flip_To_Same_Element;

public class Approach1_Naive_2N {
    public static void MinimumFlipToFill(int[] arr){
        int[] num = new int[2];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                num[arr[i-1]]++;
            }
        }
        num[arr[arr.length-1]]++;

        if(num[0]==0 || num[1]==0) {
            System.out.println("Already Filled");
            return;
        }

        int ans=0;
        if(num[1]<num[0]) ans = 1;

        if(arr[0]==ans)  System.out.println(" From Index " +0);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]!= arr[i] && arr[i]==ans){
                System.out.print(" From Index " +i);
            }
            else if(arr[i-1]!= arr[i] && arr[i]==Math.abs(ans-1)){
                System.out.println(" to Index " + (i-1));
            }

        }
        if(arr[arr.length-1]==ans)  System.out.println(" to Index " + (arr.length-1));
    }
    public static void main(String[] args) {
        MinimumFlipToFill(new int[]{1,0});
    }
}
