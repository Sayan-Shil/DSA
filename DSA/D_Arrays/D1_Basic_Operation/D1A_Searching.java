package D_Arrays.D1_Basic_Operation;

public class D1A_Searching {
    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,3,6,5},6));
    }
}
