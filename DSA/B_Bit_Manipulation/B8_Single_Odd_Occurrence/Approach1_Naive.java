package B_Bit_Manipulation.B8_Single_Odd_Occurrence;

public class Approach1_Naive {
    public static int SingleOdd(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) count++;
            }
            if((count&1)==1) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,2,1,5,5};
        System.out.println(SingleOdd(num));

    }
}
