package D_Arrays.D19_MajorityElement;

public class Approach1_Naive_O_n2 {
    public static int MajorityElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum=1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]==arr[i]) sum++;
            }
            if(sum>(arr.length/2)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(MajorityElement(new int[]{8,7,6,8,6}));
    }
}
