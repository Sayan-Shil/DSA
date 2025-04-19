package D_Arrays.D24_Weighted_PrefixSum;

public class Prefix_Sum {
    public static int[] arr = new int[]{2,3,5,4,6,1};
    public static int[] psum = new int[arr.length];
    static{
        psum[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            psum[i]=(i+1)*arr[i]+psum[i-1];
        }
    }

    public static void getInt(int start, int end){
       if(start==0) {
           System.out.println(psum[end]);
           return;
       }
        System.out.println(psum[end]-psum[start-1]);
    }
    public static void main(String[] args) {
        getInt(0,2);
    }
}
