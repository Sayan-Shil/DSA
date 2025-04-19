package D_Arrays.D23_Prefix_Sum;

public class Prefix_Sum {
    public static int[] arr = new int[]{2,8,3,9,6,5,4};
    public static int[] psum = new int[arr.length];
    static{
        psum[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            psum[i]=arr[i]+psum[i-1];
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
        getInt(1,5);
    }
}
